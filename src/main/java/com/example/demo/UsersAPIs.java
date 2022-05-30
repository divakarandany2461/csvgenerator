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
import userapis.Root;
public class UsersAPIs 
{
	public ArrayList<String> getUsers()
	{
		try
		{
			HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
			SSLContext sslContext = SSLContext.getDefault();
			SSLConnectionSocketFactory sslConnectionSocketFactory = new SSLConnectionSocketFactory(sslContext, NoopHostnameVerifier.INSTANCE);
			CloseableHttpClient httpclient = httpClientBuilder.setSSLSocketFactory(sslConnectionSocketFactory).build();
			URIBuilder uriBuilder = new URIBuilder("https://crm.localzoho.com/crm/v2/users");
			uriBuilder.addParameter("type", "AllUsers");
			uriBuilder.addParameter("page", "1");
			uriBuilder.addParameter("per_page", "2");
			HttpUriRequest requestObj = new HttpGet(uriBuilder.build());
			requestObj.addHeader("Authorization", "Zoho-oauthtoken 1000.9e51ee863f5cdf6618bb013edf7d67c3.c6e16b89c1d6ea202e36b3a054c8b4b0");
			requestObj.addHeader("If-Modified-Since", "2020-05-15T12:00:00+05:30");
			HttpResponse response = httpclient.execute(requestObj);
			HttpEntity responseEntity = response.getEntity();
		//	System.out.println("in uapi");
			//System.out.println("HTTP Status Code : " + response.getStatusLine().getStatusCode());
			if(responseEntity != null)
			{
				Object responseObject = EntityUtils.toString(responseEntity);
				String responseString = responseObject.toString();
				ObjectMapper om = new ObjectMapper();
				Root root = om.readValue(responseString, Root.class);
				ArrayList<String>str=new ArrayList<>();
				for(int i=0;i<root.getUsers().size();i++)
				{
					str.add(i, root.getUsers().get(i).getEmail());
				}
				return str;
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return null;
	}
	
}