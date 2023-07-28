package com.javacode.day3;

public class For_Loops {

	public static void main(String[] args) {
		//1st step - initialization 
		// 2nd step - condition
		// 3rd  step - if condition is true will go inside the body of for loop 
		// 3rd step - if condition is false will come outside the body of for loop 
		// 4th step - it will execute the logic inside the for loop body
		//5th step- it will update the value a s per the inc/dec operator
		//6th step- check the condition again
		// 7th step- if condition is true it will again go inside the for loop body 
		// 7th step if condition is false it will go out of the for loop  body 
		
		
		// wap to print from 100 to 1 using for loop 
		// sum 100+99+98+97+94+......+1=?????
		
  int sum=0;
		for (int i=100; i>=1; i--) {
			System.out.print(i+" ");//100,99,98
			sum   =sum+i;// sum  = 0+100 =100, 199, 297
			             //100,99,98,
		System.out.print(sum);
		}
		System.out.println();
		System.out.println("********************************************************************");
	// wap to print from 500 till 0 with a difference of 25 and add the numbers 
		// 500,475,450,.........25
		// 500+475+450+..........+25=?
		int sum1=0; 
		for (int s=500; s>=25; s-=25) {
			System.out.print(s +" ");
			sum1 = sum1 +s; 
		}
	
	System.out.println();
	System.out.println(sum1);
	
	}

}
