package com.sree.Arrays;

public class MinMaxArray {
	
	public static void main(String[] avgs){
		
		int[] array = new int[5];
		
		int array1[]={1,3,56,89};
		
		int min=Integer.MAX_VALUE;
		int max=0;
		
		for (int i=0; i<array1.length ; i++){
			
			if(array1[i]>max) { max=array1[i]; }
		    if(array1[i]< min) {min= array1[i];}
			
		}
		System.out.println("min is " + min);
		
		System.out.println("max is " + max);
	}

}