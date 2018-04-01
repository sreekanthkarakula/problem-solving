package com.sree.Arrays;

public class SwiftzerostoRight {
	
	public static void main(String args[])
	{
		
		int[] arr = {0, 1, 0, 0, 4, 0, 0 };
		
		int indexofrightposition= arr.length-1;
		
		int start=0;
		
		while(start < indexofrightposition){
			
			if(arr[start] == 0 && arr[indexofrightposition] !=0 ){
				//swap
				arr[start] = arr[indexofrightposition];
				
				arr[indexofrightposition]=0;
				
				start++;
				
				indexofrightposition--;
				
				
			}
			else 
				if (arr[start] == 0 && arr[indexofrightposition] ==0){
					indexofrightposition--;
				}
				else start++;
			
			
		}
		
		for(int j =0; j<arr.length ; j++){
			
			System.out.println(arr[j]);
		}
		
	}

}
