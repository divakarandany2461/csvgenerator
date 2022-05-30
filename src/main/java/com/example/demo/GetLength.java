//$Id$
package com.example.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import fieldsPojo.Boot;

public class GetLength {
	public static int getLen(Boot root,String key) throws JsonMappingException, JsonProcessingException
	{
		
		
		for(int i=0;i<root.getFields().size();i++)
		{
			if(key.contentEquals(root.getFields().get(i).getField_label()))
			{
				return root.getFields().get(i).getLength();
			}
		}
		return 0;
		
	}
	public static String getDatatype(Boot root,String key) throws JsonMappingException, JsonProcessingException
	{
		
		for(int i=0;i<root.getFields().size();i++)
		{
			if(key.contentEquals(root.getFields().get(i).getField_label()))
			{
				return root.getFields().get(i).getData_type();
			}
		}
		return "";
		
	}
}
