package com.sree.java_puzzles;

public class GetregexCountFromString {
	
	//given a string "abcdfdxyxghdfdfdiopdfd"

	public static void main(String args[]){
		
		String giveninput = "abcdfdxyxghdfdfdiopdfd";
		
		//get the count of "dfd" in the above string the count should be 4
		// abc dfd xyxgh dfdfd(count as 2) iop dfd
		String regex = "dfd";
		
		String newinput = giveninput;
		
		int length = newinput.length();
		
		while(true){
			
			//get the index of next d in the string and check the substring between d index and next 2 chars
			
			int indexofd = newinput.indexOf("d");
			
			int endindex = indexofd+2;
			
			if(endindex<length){
				
				newinput.substring(indexofd, endindex).equals(regex);
				
				
			}
			
			
		}
		
		
	}
}
