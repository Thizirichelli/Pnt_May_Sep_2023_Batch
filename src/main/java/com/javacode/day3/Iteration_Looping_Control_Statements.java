package com.javacode.day3;

public class Iteration_Looping_Control_Statements {

	public static void main(String[] args) {
		
		
// while loop
// while loop is control flow statement which is used when the boolean condition needs  lot of repetition 
// while loop is  also  known as repeating if statement 
// if the number of iterations is not fixed, it is recommended to use while loop 

		 // initialization
		// condition
		// increment or decrement or upgradation  or degradation 
		
		int i=1; 
		while (i<=10) {
			System.out.println(i);
			break;
		}
		System.out.println("**********************");
		// wap to print first 10 natural numbers using while loop
		int j=1;
		while (j<=10) {
			System.out.print(j+" ");
			j++;
			
		}
		System.out.println();
	System.out.println("***************************************");	
	// wap to print first 20 whole number 
	int k=0;
	while (k<20) {
		System.out.print(k+" ");
		k++; 
	}
System.out.println();
System.out.println("*****************************");

 // wap to print first 25 even numbers
 int l=2;
 //while (l<=50) {
	 //System.out.print(l +" ");
	// l+=2; 
 //}
 //System.out.println();
 //System.out.println("************************");
 
	while (l<=50) {
		System.out.print(l +" ");
		l=l+2; 
	}
		
	System.out.println();
	 System.out.println("************************");
	 
		// wap to print 20 numbers in reverse order starting from 100 and decrement of 5  
	 //100, 95, ........5 add all the 20 numbers 100+95+90....+5=?
	 int m=100;
	 while (m>=5) {
		 System.out.print(m +" ");
		 m= m-5;
	
	 }
	 System.out.println();
	 System.out.println("********************");
	
	 
	}

}
