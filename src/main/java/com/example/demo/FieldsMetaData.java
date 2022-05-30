package com.example.demo;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import javax.net.ssl.SSLContext;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.databind.ObjectMapper;

import fieldsPojo.Boot;
@RestController
public class FieldsMetaData 
{
	public FieldsMetaData(){
		
	}
	  public static void sendfields(ArrayList<String>arr) throws ParseException, NoSuchAlgorithmException, IOException, URISyntaxException 
	  { 
	  ConvertCsvToZip ctz=new ConvertCsvToZip(); 
	  ctz.zipFiles(arr); 
	  }
	 
	public static String displayFields(String modulename,String oauth) throws ParseException, IOException, NoSuchAlgorithmException, URISyntaxException
	{
			HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
			SSLContext sslContext = SSLContext.getDefault();
			SSLConnectionSocketFactory sslConnectionSocketFactory = new SSLConnectionSocketFactory(sslContext, NoopHostnameVerifier.INSTANCE);
			CloseableHttpClient httpclient = httpClientBuilder.setSSLSocketFactory(sslConnectionSocketFactory).build();
			URIBuilder uriBuilder = new URIBuilder("https://crm.localzoho.com/crm/v2/settings/fields");
			uriBuilder.addParameter("module", modulename);
			HttpUriRequest requestObj = new HttpGet(uriBuilder.build());
			requestObj.addHeader("Authorization", "Zoho-oauthtoken "+oauth);
			HttpResponse response = httpclient.execute(requestObj);
			HttpEntity responseEntity = response.getEntity();
			ArrayList<String>fields=new ArrayList<String>();
			if(responseEntity != null)
			{
				Object responseObject = EntityUtils.toString(responseEntity);
				String responseString = responseObject.toString();
				return responseString;		
			}
			return null;
			 
}	
	public static ArrayList<String> dispField(String[]arr) throws NoSuchAlgorithmException, URISyntaxException, ClientProtocolException, IOException 
	{
			HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
			SSLContext sslContext = SSLContext.getDefault();
			SSLConnectionSocketFactory sslConnectionSocketFactory = new SSLConnectionSocketFactory(sslContext, NoopHostnameVerifier.INSTANCE);
			CloseableHttpClient httpclient = httpClientBuilder.setSSLSocketFactory(sslConnectionSocketFactory).build();
			URIBuilder uriBuilder = new URIBuilder("https://crm.localzoho.com/crm/v2/settings/fields");
			uriBuilder.addParameter("module", arr[0]);
			HttpUriRequest requestObj = new HttpGet(uriBuilder.build());
			requestObj.addHeader("Authorization", "Zoho-oauthtoken "+arr[1]);
			HttpResponse response = httpclient.execute(requestObj);
			HttpEntity responseEntity = response.getEntity();
			ArrayList<String>fields=new ArrayList<String>();
			//System.out.println("In fields");
			System.out.println("HTTP Status Code : " + response.getStatusLine().getStatusCode());
			if(responseEntity != null)
			{
				Object responseObject = EntityUtils.toString(responseEntity);
				String responseString = responseObject.toString();
				ObjectMapper om = new ObjectMapper();
				 Boot root = om.readValue(responseString, Boot.class);
				  for(int i=0;i<root.getFields().size();i++) 
					 fields.add(i, root.getFields().get(i).getField_label());
				  }
			return fields;	 
}	
}