//$Id$
package com.example.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.http.ParseException;

import com.fasterxml.jackson.databind.ObjectMapper;

import fieldsPojo.Boot;

public class GenerateData {
 
	public ArrayList<String> dataGenerate(HashMap<String,Integer>Map,HashMap<String,HashMap<String,String>>Map1,String oauth) throws IOException, ParseException, NoSuchAlgorithmException, URISyntaxException
	{
		String responseString;
		String dataType;
		ObjectMapper om = new ObjectMapper();
		String url="/home/local/ZOHOCORP/divakar-pt5261/git/diva/DataExtractor/";
		String ext=".csv";
		int count;
		ArrayList<String>arr=new ArrayList<String>();		
		StringBuilder sb = new StringBuilder();
		String rb;
		String prefix;
		int len;
			 for (Entry<String,Integer > entry : Map.entrySet()) 
			 {
				    responseString=FieldsMetaData.displayFields(entry.getKey(),oauth);
					Boot root = om.readValue(responseString, Boot.class);
					String module=entry.getKey();
					int row=entry.getValue();
					BufferedWriter writer = new BufferedWriter(new FileWriter(url+module+ext));
					arr.add(url+module+ext);
					for(Entry<String,HashMap<String,String>>entry1:Map1.entrySet())
					{
						
						if(entry1.getKey().contentEquals(module))
						{
							HashMap<String,String>fieldMap=new HashMap<String, String>();
							for(Entry<String,String>entry2:entry1.getValue().entrySet()) {
								 
								fieldMap.put(entry2.getKey(),entry2.getValue());
							}
							 count=0;
							 sb.setLength(0);
							 for(int i=0;i<(row+1);i++) 
							  {
								 if(count==0) 
							  { 
								  for (Entry<String, String> entry3 : fieldMap.entrySet()) {
									 
									  sb.append(entry3.getKey()).append(","); 
								  }
								  String name=sb.toString();
								  writer.write(name); 
								  writer.newLine(); 
								  count++; 
							  } 
						
						  else 
						  { 
							  StringBuilder Data= new StringBuilder();
						  for (Entry<String, String> entry3 : fieldMap.entrySet()) 
						  {
						  rb=entry3.getKey(); 
						  prefix=entry3.getValue();
						  dataType = GetLength.getDatatype(root,rb);
						  len=GetLength.getLen(root,rb);
						  Data.append(RandomDataGenerator.getData(rb,dataType,len,prefix,root)); 
						  } 
								 String type=Data.toString(); 
								 writer.write(type); 
								 writer.newLine(); 
								 }
						 
							  } 
						}
						
					}
				writer.close();	 
			 }
			return arr;
		  }
	}

