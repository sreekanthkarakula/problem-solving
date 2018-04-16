package com.sree.java_puzzles;

public class CountChars {
	
	//given a string  aabcedddggj the output is 2a1b1c1e3d2g1j
	
	public static void main(String args[]){
		
		String input =  "aabcedddggj";
		
		int count=0, index =0;
		
		int length = input.length();
		
		char check='\0';
		
		StringBuilder sb = new StringBuilder();
		
		while(index<length) {
			
			if(index == 0) {
				count++;
			    check = input.charAt(0);
				index++;
			
			}
		    if(check == input.charAt(index)) {
				count++;
				check = input.charAt(index);
				index++;
			}
			
			else {
				sb.append(count);
				sb.append(check);
				check = input.charAt(index);
				count=1;
				index++;
			}
		    
		    System.out.println("index is " + index);
			
		}
		
		System.out.println("this is o/p  " + sb);
		
		
	}

}
