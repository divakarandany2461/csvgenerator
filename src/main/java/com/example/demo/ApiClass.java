package com.example.demo;

import java.io.IOException;

import org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoProperties.Storage;
import org.springframework.core.io.InputStreamResource;
import java.net.URISyntaxException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.http.HttpRequest;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import fieldsPojo.Boot;

import java.io.File;
import java.io.FileInputStream;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class ApiClass {
	@RequestMapping(value = "/download", method = RequestMethod.GET)
	public ResponseEntity<Object> downloadFile() throws IOException {
		String filename = "/home/local/ZOHOCORP/divakar-pt5261/Downloads/demo/test.zip";
		File file = new File(filename);
		InputStreamResource resource = new InputStreamResource(new FileInputStream(file));

		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Disposition", String.format("attachment; filename=\"%s\"", file.getName()));
		headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
		headers.add("Pragma", "no-cache");
		headers.add("Expires", "0");

		ResponseEntity<Object> responseEntity = ResponseEntity.ok().headers(headers).contentLength(file.length()).contentType(MediaType.parseMediaType("application/txt")).body(resource);

		return responseEntity;
	}

	@PostMapping(value = "/modules")
	public ArrayList<String> getModule(@RequestBody String oauthToken) throws ParseException, NoSuchAlgorithmException, IOException, URISyntaxException {
		ArrayList<String> arr = GetListofModules.getMod(oauthToken);
		
		return arr;
	}

	@PostMapping(value = "/fields")
	public ArrayList<String> getFields(@RequestBody String[] arr) throws NoSuchAlgorithmException, ClientProtocolException, URISyntaxException, IOException {
		ArrayList<String> arr1 = FieldsMetaData.dispField(arr);
		return arr1;
	}

	@PostMapping(value="/csvapi") 
	  public String generateCsv(@RequestBody String str) throws ParseException, NoSuchAlgorithmException, IOException, URISyntaxException, JSONException 
	  { 
		  int index=str.indexOf("&");
		  String responseString=str.substring(index+1);
		  HashMap<String, HashMap<String, String>>Map1= StorageClass.getFieldsList(str);
		  HashMap<String,Integer>Map2=StorageClass.getMap(str);
		  GenerateData gd=new GenerateData(); 
		  ArrayList<String>arr=gd.dataGenerate(Map2, Map1, responseString);
		  
		  if(arr.size()!=0)
			  {
			    FieldsMetaData.sendfields(arr);
			  }
		  return("success");
	  }

}