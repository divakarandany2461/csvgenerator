
  package com.example.demo;
  
  import java.util.ArrayList; 
  import java.util.HashMap; 
  import org.json.JSONException;
import org.json.JSONObject;
  
  public class StorageClass {
 
	
	  public static  HashMap<String,Integer> getMap(String str) throws JSONException {
	  
		  int ind=str.indexOf("^");
		  int index=str.indexOf("&");
		  String numstr=(String) str.subSequence(ind+1, index);
		 System.out.println(numstr); 
		 JSONObject jsonObj1 = new JSONObject(numstr);
		 java.util.Iterator keys = jsonObj1.keys();
		  HashMap<String,Integer>Map=new HashMap<String,Integer>(); 
		  while(keys.hasNext()) {
		  
		  String StrObj=(String) (keys.next());
		  Map.put(StrObj,Integer.parseInt((String) jsonObj1.get(StrObj)));
		  
		  } 
		
		  return Map;
		
	  }
	 
  public static HashMap<String,HashMap<String,String>> getFieldsList(String str) throws JSONException {
	  int ind=str.indexOf("^");
	  int index=str.indexOf("&");
	  String jsonstr=(String) str.subSequence(0, ind);
	  String numstr=(String) str.subSequence(ind+1, index);
	  JSONObject jsonObj = new JSONObject(jsonstr);
	  JSONObject jsonObj1 = new JSONObject(numstr);
	  java.util.Iterator keys = jsonObj1.keys();
	  HashMap<String,HashMap<String,String>>Map=new HashMap<String,HashMap<String,String>>();
	  ArrayList<String>arr=new ArrayList<String>();
	 
	  while(keys.hasNext())
      {
		  
   	    String StrObj=(String) (keys.next());
   	    arr.add(StrObj);
   	    
      }
	  
	  for(int i=0;i<arr.size();i++)
	  {
		  HashMap<String,String>Map2=new HashMap<String,String>();
		  for(int j=0;j<jsonObj.getJSONArray(arr.get(i)).length();j++) 
		  {
		    
		    Map2.put((String)jsonObj.getJSONArray(arr.get(i)).getJSONArray(j).get(0),(String)jsonObj.getJSONArray(arr.get(i)).getJSONArray(j).get(1));
	      }
		  Map.put(arr.get(i), Map2);
	  }
	  
	 
	return Map;
	  
	  
	  
  }
  }
 