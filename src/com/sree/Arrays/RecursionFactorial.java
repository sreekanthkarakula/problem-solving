package com.sree.Arrays;

public class RecursionFactorial {
	
	public static int result;

	public static void main(String args[]){
		
		int n =3;
		
		System.out.println(factorial(n));
		
		
	}
	
	public static int factorial(int num){
		
		//int result;

		if(num>1){
			
			result = num*factorial(num-1);
		}
		
		if(num == 0 || num == 1) return 1;
		
		return result;
		
	}
}
