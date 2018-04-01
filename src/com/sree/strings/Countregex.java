package com.sree.strings;

public class Countregex {
	
	public static void main(String args[]){
		
		String input = "abdfdxylmdfdfdiopdfkdfd";
		
		String regex = "dfd";
		
		int givenlength = input.length();
		
		System.out.println("try this " + input.indexOf(regex));
		
		int count = 0;
		
		/*while( input.length() > 3){
			
			input = new String(input.substring(2, 5));
			
			input.
			
		}*/
		
		System.out.println("try this " + input.contains("dfd"));
		
		
	}

}
