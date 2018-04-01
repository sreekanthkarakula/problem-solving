package com.sree.Threading;

public class ThreadImplTest {

	public static void main(String args[]){
		
		Thread t1 = new Thread( new ThreadImpl());
		Thread t2 = new Thread( new ThreadImpl());
		t1.start();
		t2.start();
		
	}
}
