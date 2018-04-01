package com.sree.Threading;

public class TestThreads {
	
	public static void main(String args[]){
		
		  	SreeThread runner1 = new SreeThread();
	        runner1.start();

	        SreeThread runner2 = new SreeThread();
	        runner2.start();
		
	}

}
