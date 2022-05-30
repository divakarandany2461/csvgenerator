package com.example.demo;
import java.util.ArrayList;

import javax.net.ssl.SSLContext;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import modulePojo.RtCLass;
public class GetListofModules
{
	public static ArrayList<String> getMod(String oauthToken) 
	{
		try
		{
			HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
			SSLContext sslContext = SSLContext.getDefault();
			SSLConnectionSocketFactory sslConnectionSocketFactory = new SSLConnectionSocketFactory(sslContext, NoopHostnameVerifier.INSTANCE);
			CloseableHttpClient httpclient = httpClientBuilder.setSSLSocketFactory(sslConnectionSocketFactory).build();
			URIBuilder uriBuilder = new URIBuilder("https://crm.localzoho.com/crm/v2/settings/modules");
			HttpUriRequest requestObj = new HttpGet(uriBuilder.build());
			requestObj.addHeader("Authorization", "Zoho-oauthtoken "+oauthToken);
			HttpResponse response = httpclient.execute(requestObj);
			HttpEntity responseEntity = response.getEntity();
			ArrayList<String>arr=new ArrayList<>();
			System.out.println("HTTP Status Code : " + response.getStatusLine().getStatusCode());
			if(responseEntity != null)
			{
				Object responseObject = EntityUtils.toString(responseEntity);
				String responseString = responseObject.toString();
				System.out.println(responseString);
				ObjectMapper om = new ObjectMapper();
				RtCLass root = om.readValue(responseString, RtCLass.class);
				String str;
				for(int i=0;i<root.getModules().size();i++) {
					if(root.getModules().get(i).getPlural_label().contains(" "))
					{
						str=root.getModules().get(i).getPlural_label().replace(" ","_");
					}
					else if(root.getModules().get(i).getPlural_label().equals("Meetings"))
					{
						str=root.getModules().get(i).getPlural_label().replace("Meetings","Events");
					}
					else
					{
						str=root.getModules().get(i).getPlural_label();
					}
					arr.add(i, str);
				  }
				
				System.out.println(arr.toString());
			}
			return arr;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return null;
	}
	public static void main(String[] args)
	
	{
		ArrayList<String>arr=getMod("1000.17287bb0a95f46a83424de08615754ff.e3e2fed032a0d8c91924fcebe00e63ee");
		for(int i=0;i<arr.size();i++)
		{
			System.out.println(arr.get(i));
		}
	}
}