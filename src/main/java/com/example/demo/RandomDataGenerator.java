package com.example.demo;
import java.util.ArrayList;
import java.util.Random;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import fieldsPojo.Boot;
public class RandomDataGenerator {
	static int cnt=0;
	static int cnt1=0;
 public static StringBuilder getData(String rb,String str,int len,String prefix,Boot root) throws JsonMappingException, JsonProcessingException
 {
	
	 Random random = new Random();
	 if(str.equals("text")||str.equals("textarea"))
     {
		 StringBuilder sb = new StringBuilder();
		 int totlen=len-prefix.length();
		 sb.append(prefix);
		 int randnum=random.nextInt(totlen+1)+4;
		 if(randnum>200) {
			 randnum=random.nextInt(200)+5;
		 }
		   for(int i = 0; i < randnum; i++) {

			      String alp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			      String alphabet=alp.toLowerCase();
			      int index = random.nextInt(alphabet.length());
			      char randomChar = alphabet.charAt(index);
			      sb.append(randomChar);
			     
			    }
		   sb.append(",");
		   return sb;
	 }
	 else if(str.equals("integer")||str.equals("bigint")||str.equals("autonumber"))
	   {
		   StringBuilder sb = new StringBuilder();
		   int randnum=random.nextInt(len);
		   sb.append(randnum+1);
		   sb.append(",");
		   return sb;
	   }
	 else if(str.equals("double")||str.equals("currency"))
	   {
		   StringBuilder sb = new StringBuilder();	   
		  double randnum=random.nextDouble();
		  double randomValue = (double) (len);
		   sb.append(randnum*randomValue);
		   sb.append(",");
		   return sb;
	   }
	 else if(str.equals("boolean"))
	   {
		  StringBuilder sb = new StringBuilder();	   
		  String [] b= {"true","false"};
		  int randnum=random.nextInt(2);
		  sb.append(b[randnum]);
		   sb.append(",");
		   return sb;
	   }
	 else if(str.equals("ownerlookup")||str.equals("userlookup"))
	 {
		
		 StringBuilder sb = new StringBuilder();	 
		 for(int i=0;i<root.getFields().size();i++)
		 {
			 if(root.getFields().get(i).getField_label().equals(rb))
			 {
				 sb.append(root.getFields().get(i).getId());
				 break;
			 }
			
		 }
		 sb.append(",");
		 return sb;
	 }
	 else if(str.equals("lookup"))
		 
	 {
		
		 StringBuilder sb = new StringBuilder();	 
		 for(int i=0;i<root.getFields().size();i++)
		 {
			 if(root.getFields().get(i).getField_label().equals(rb))
			 {
				  sb.append(root.getFields().get(i).getLookup().getId());
				  break;
			 }
			
		 }
		 sb.append(",");
		 return sb;
	 }
	 else if(str.equals("profileimage"))
	 {
		 cnt++;
		 StringBuilder sb = new StringBuilder();
		 sb.append("image");
		 sb.append(cnt);
		 sb.append(",");
		
		 return sb;
	 }
	 else if(str.equals("email"))
	 {
		 cnt1++;
		 StringBuilder sb = new StringBuilder();
		 sb.append(prefix);
		 int randnum2=random.nextInt(5)+1;
		 for(int i = 0; i < randnum2; i++) {

		      String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		      String alp=alphabet.toLowerCase();
		      int index = random.nextInt(alp.length());
		      char randomChar = alp.charAt(index);
		      sb.append(randomChar);
		    }
		 sb.append(cnt1);
		 sb.append("@");
		 int randnum=random.nextInt(6)+4;
		   for(int i = 0; i < randnum; i++) {

			      String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			      String alp=alphabet.toLowerCase();
			      int index = random.nextInt(alp.length());
			      char randomChar = alp.charAt(index);
			      sb.append(randomChar);
			    }
		 sb.append(".");
		 int randnum1=random.nextInt(3)+1;
		   for(int i = 0; i < randnum1; i++) {

			      String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			      String alp=alphabet.toLowerCase();
			      int index = random.nextInt(alp.length());
			      char randomChar = alp.charAt(index);
			      sb.append(randomChar);
			    }
	   sb.append(",");
		   return sb;
	 }
	 else if(str.equals("website"))
	 {
		 StringBuilder sb = new StringBuilder();
		 sb.append(" https://");
		 sb.append(prefix);
		 int randnum1=random.nextInt(6)+1;
		   for(int i = 0; i < randnum1; i++) {

			      String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			      String alp=alphabet.toLowerCase();
			      int index = random.nextInt(alp.length());
			      char randomChar = alp.charAt(index);
			      sb.append(randomChar);
			    }
		 sb.append(".");
		 int randnum=random.nextInt(4)+1;
		   for(int i = 0; i < randnum; i++) {

			      String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			      String alp=alphabet.toLowerCase();
			      int index = random.nextInt(alp.length());
			      char randomChar = alp.charAt(index);
			      sb.append(randomChar);
			    }
		 sb.append(",");
		 return sb;
	 }
	 else if(str.equals("phone"))
	{
		 StringBuilder sb = new StringBuilder();
		 String num="6789";
		 int index1 = random.nextInt(4);  
		  sb.append(num.charAt(index1));
		   for(int i = 1; i <10; i++) { 
			     int index = random.nextInt(10); 
			      sb.append(index);
			      
			    }
		 sb.append(",");
		 return sb;
	}
	 else if(str.equals("datetime"))
	 {
		 StringBuilder sb = new StringBuilder();
		 sb.append("20");
		 int r=random.nextInt(3);
		 sb.append(r);
		 int r1=random.nextInt(10);
		 sb.append(r1);
		 sb.append("-");
		 int index = random.nextInt(2);
		 sb.append(index);
		 if(index==1)
		 {
		  int index1=random.nextInt(3);
		  sb.append(index1);
		 }
		 else if(index==0)
		 { 
			int index1=random.nextInt(9)+1;
			sb.append(index1);
		 }
		 sb.append("-");
		 String s2="0123";
		 int index2 = random.nextInt(s2.length());
		 sb.append(s2.charAt(index2));
		 if(index2==3)
			 sb.append("0");
		 else {
		 int index1=random.nextInt(10);
		 sb.append(index1);
		 }
		 sb.append("T");
		 int index1=random.nextInt(24);
		 if(index1<10) {
			 sb.append("0");
		 }
		 sb.append(index1);
         sb.append(":");
         int index3=random.nextInt(60);
         if(index3<10)
        	 sb.append("0");
         sb.append(index3);
         sb.append(":");
         int index4=random.nextInt(60);
         if(index4<10)
        	 sb.append("0");
         sb.append(index4);
		 sb.append(",");
		 return sb;
	 }
	 else if(str.contentEquals("date"))
	 {
		 StringBuilder sb = new StringBuilder();
		 sb.append("20");
		 
		 for(int i = 0; i <2; i++) {
			  String s="0123456789";
		      int index = random.nextInt(s.length());
		      char randomChar = s.charAt(index);
		      sb.append(randomChar);
		    }
		 sb.append("-");
		 int index = random.nextInt(2);
		 sb.append(index);
		 if(index==1)
		 {
		  int index1=random.nextInt(3);
		  sb.append(index1);
		 }
		 else if(index==0)
		 { 
			int index1=random.nextInt(9)+1;
			sb.append(index1);
		 }
		 sb.append("-");
		 String s2="0123";
		 int index2 = random.nextInt(s2.length());
		 sb.append(s2.charAt(index2));
		 if(index2==3)
			 sb.append("0");
		 else {
		 int index1=random.nextInt(10);
		 sb.append(index1);
		 }
		 sb.append(",");
		 return sb;
	 }
	 else if(str.equals("picklist"))
	 {
		 StringBuilder sb = new StringBuilder(); 
		 ArrayList<String>arr=new ArrayList<String>();	
		 for(int i=0;i<root.getFields().size();i++)
		 {
			 if(root.getFields().get(i).getField_label().equals(rb)) 
			 {
				
				 for(int j=0;j<root.getFields().get(i).getPick_list_values().size();j++) 
				 {
			       arr.add(root.getFields().get(i).getPick_list_values().get(j).getDisplay_value());
			     }
			 }
		 }
		 int size=arr.size();
		 if(size!=0) {
		 int randnum=random.nextInt(size);
		 sb.append(arr.get(randnum));
		 }
		 
		 sb.append(",");
		   //System.out.println(root.fields.get(i).);
		 return sb;
	 }
	 else if(str.equals("multiselectpicklist"))
	 {
		 StringBuilder sb = new StringBuilder();
		 ArrayList<String>arr=new ArrayList<String>();
		 for(int i=0;i<root.getFields().size();i++)
		 {
			 if(root.getFields().get(i).getField_label().equals(rb)) 
			 {
				 for(int j=0;j<root.getFields().get(i).getPick_list_values().size();j++) 
				 {
			       arr.add(root.getFields().get(i).getPick_list_values().get(j).getDisplay_value());
			     }
			 }
		 }
		 int size=arr.size();
		 int randnum=random.nextInt(size);
		 int randnum2=random.nextInt(size);
		 int randnum1=random.nextInt(2);
		 if(randnum1==1) {
		 sb.append(arr.get(randnum));
		 }
		 else {
			 while(randnum==randnum2)
			 {
				 randnum=random.nextInt(size);
			 } 
			 sb.append(arr.get(randnum));
			 sb.append(";");
			 sb.append(arr.get(randnum2));
		 }
		 sb.append(",");
		
		 return sb;
	 }
	 else
	 {
		 StringBuilder sb = new StringBuilder();
		   sb.append(" ");
		   sb.append(",");
		   return sb;
	 }
	
 }

 
}
