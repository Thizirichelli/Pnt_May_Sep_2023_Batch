package com.javacode.day2;

public class Explanation_increment_Decrement_Operators {

	public static void main(String[] args) {

		int i=1;     //   latest value of i is 1
		    //i++; // Latest value of i is 2
		    //++i; // latest  value of i is 3
		//System.out.println(i);  
		 //int j = i++;
		// System.out.println(j);
		// System.out.println(i);
		int j =++i; // latest value of j is 2
		            // latest value of i is 2
		
		//System.out.println(j);
		//System.out.println(i);
		int k = i++ + ++i +j++; 
		// i= 3,  4      =4
		// j=3            =3
		// k= 2+4+2        =8
		
		int l = k-- - --k + i-- - --i +j++ - --j; 
		// latest value of i is 4
		// latest value of j is 3
		// latest value of k is 8
		// l= 8 - 6 + 4 -2 +3  - 3 =4
		// k= 7, 6                 =6
		// i= 3, 2                  2
		// j=          4, 3        =3
		
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		
		
		
		
	}

}
