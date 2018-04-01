package com.sree.Threading;

public class SimpleDeadlockl {
	
	static Object obj1 = new Object();
	
	static Object obj2 = new Object();
	
	public static void main(String args[]){
		
		Thread  t1 = new Thread1();
		
		Thread t2 = new Thread2();
		
		t1.start();
		
		t2.start();
	}
	
	private static class Thread1 extends Thread{
		
		@Override
		public void run(){
			
			synchronized (obj1) {
				
				 System.out.println("Thread 1: Holding lock 1...");
	                try {
	                    Thread.sleep(10);
	                } catch (InterruptedException ignored) {}
	                System.out.println("Thread 1: Waiting for lock 2...");
	                synchronized (obj2) {
	                    System.out.println("Thread 2: Holding lock 1 & 2...");
	                }
				
			}
			
		}
	}
	
	private static class Thread2 extends Thread{
		
		@Override
		public void run() {
			
			synchronized (obj2) {
				

				 System.out.println("Thread 2: Holding lock 2...");
	                try {
	                    Thread.sleep(10);
	                } catch (InterruptedException ignored) {}
	                System.out.println("Thread 2: Waiting for lock 1...");
	                synchronized (obj1) {
	                    System.out.println("Thread 2: Holding lock 1 & 2...");
	                }
				
			}
			
		}
	}

}


