package com.javacode.day3;

public class Selection_Conditional_Control_Statements {

	public static void main(String[] args) {
		// if 
		// syntax:
		//if(condition) {
		//}
if (2<3) {
	System.out.println("I am learning if syntax");
	// why we put if between brackets 
}
     // if else 
if(2>3) {
	System.out.println("Print something");
	}else {
		System.out.println("the condition is incorrect");
	}

    // if else if 
     // we learn with a programming concept 
    // find the largest of 3 number 
    //int i =10, j = 20, k = 30;
    //if (i>j && i>k) {
    	//se if (j>i && j>k) {
    	//System.out.println("j is the greatest :"+j);
   // }else {
    	//System.out.println("k is the greatest :"+k);
   // }
   // WAP to determine smallest of 5 numbers
  
    int i =10, j = 20, k = 30, l=40, m=50;
    if (i<j && i<k && i<l && i<m) {
    	System.out.println("i is the smallest:" +i);
    }else if (j<i && j<k && j<l && j<m) {
        System.out.println("j is the smallest:" +j);	
    }else if (k<i && k<j && k<l && k<m) {
    	System.out.println("k is the smallest:" +k);
    }else if (l<i && l<j && l<k && l<m){
    	System.out.println("l is the smallest:" +l);
    }else   {
    // even you will write else if (m<i && m<j && m<k && m<l)   it will give the same result
    	System.out.println("m is the smallest:" +m);
    }
    
    // wap to determine witch numbers are prime (I will do it later )
    // wap to determine whether the number is even or odd 
    int a=2;
    if (a%2 == 0) {
    	System.out.println("a is even ");
    }else {
    	System.out.println("a is odd");
    }
    int b=3; 
    if (b%2 == 0) {
    	System.out.println("b is even ");
    }else {
    	System.out.println("b is odd");
    }
    int c=9;
    if (c%2 == 0) {
    	System.out.println("c is even ");
    }else {
    	System.out.println("c is odd");
    }
    int d=12;
    if (d%2 == 0) {
    	System.out.println("d is even ");
    }else {
    	System.out.println("d is odd");
    }// why we didn't change the number S
    // wap to determine which year is a leap year
    int year1= 1996, year2 = 1900, year3 = 2000;
    
     if ((year1%400 == 0)||( year1 %4 ==0 && year1%100  !=0)) {
    System.out.println("year1 - 1996 is a leap year");
     }else {
    	 System.out.println("year1 - 1996 is not a leap year");
     }
     if ((year2%400 == 0)||( year2 %4 ==0 && year2%100  !=0)) {
    	    System.out.println("year2 - 1900 is a leap year");
    	     }else {
    	    	 System.out.println("year2 - 1900 is not a leap year");
    	     }
     if ((year3%400 == 0)||( year3 %4 ==0 && year3%100  !=0)) {
    	    System.out.println("year3 - 2000 is a leap year");
    	     }else {
    	    	 System.out.println("year3 - 2000 is not a leap year");
    	     }
	
	
	}

}
