package com.sree.java_puzzles;

public class GetregexCountFromString {
	
	//given a string "abcdfdxyxghdfdfdiopdfd"

	public static void main(String args[]){
		
		String giveninput = "abcdfdxyxghdfdfdfdiopdfd";
		
		//get the count of "dfd" in the above string the count should be 4
		// abc dfd xyxgh dfdfd(count as 2) iop dfd
		String regex = "dfd";
		
		int count=0;
		
		
		while ( giveninput.length() >=3) {
			
			int index = giveninput.indexOf('d');
			
			giveninput = giveninput.substring(index);
			
			
			if(giveninput.substring(0, 3).equals("dfd")) {
				count++;
			}
			
			giveninput = giveninput.substring(1);
						
			System.out.println("string changed to"+ giveninput);
			
		}
		
		System.out.println(count);
	}
}
