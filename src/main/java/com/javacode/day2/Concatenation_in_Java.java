package com.javacode.day2;

public class Concatenation_in_Java {
	// Concatenation means joining and it is represented by  + 

	public static void main(String[] args) {
  //String  S1 ="Hello";
  //String  S2 ="World";
  //String  S3 = S1+S2 ;
  
  //System.out.println(S3);
  //System.out.println(S1 +" "+ S2); //  when we give a spice  between words 
  
  // EX: My name is : > Name
  // My language is : > English 
  // My country is : Country1 Country2 Country3 
		String S1 = "My name is :"; 
		String S2 = "> Name"; 
		System.out.println(S1 + " "+ S2);
  
		String S3 = "My language is :"; 
		String S4 = "> English"; 
		System.out.println(S3 + " "+ S4);
		
		String S5 = "My country is :"; 
		String S6 = "> country1 country2 country3"; 
		System.out.println(S5 + " "+ S6);	
		
		
		// what if we try to concatenate different data types
		int i = 10;
		int j = 20;
		String S9 = "Hello";
		String S10 = "World";
		System.out.println(i+j+S9+S10);
		System.out.println(S9+S10+i+j);
		System.out.println(S9+S10+(i+j));
		
	}

}
