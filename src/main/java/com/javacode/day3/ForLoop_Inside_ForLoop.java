package com.javacode.day3;

public class ForLoop_Inside_ForLoop {

	public static void main(String[] args) {
		
	for (int i=1; i<=3; i++) {// this is out for loop (outer for loop represent rows)
		
		
		for (int j=1; j<=5 ; j++) {//  this is inner for loop (inner for loop represents cols 
			System.out.print("Green" +" ");
		}
		System.out.println("World" +" ");
	}
		
		

	}

}
