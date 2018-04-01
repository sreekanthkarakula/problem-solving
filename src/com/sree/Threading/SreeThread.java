package com.sree.Threading;

public class SreeThread extends Thread{
	
	@Override
	public void run(){
		
		for(int i=0; i< 5; i++){
			
			System.out.println("Hello: " + i + " Thread: " + Thread.currentThread().getName());
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
