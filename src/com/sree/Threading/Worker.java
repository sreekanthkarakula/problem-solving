package com.sree.Threading;

public class Worker {
	
	public int count = 0;
	
	public static void main(String args[]){
		
		Worker w =new Worker();
		
		w.doWork();
		
	}
	
	public synchronized void increment(String nameofthread) throws InterruptedException {
		// TODO Auto-generated method stub
		count++;
		System.out.println("threadname " +nameofthread + "this is the count" + count);
		
	}

	private void doWork() {
		
		// TODO Auto-generated method stub
		
		Thread t1 =new Thread( new Runnable(){

			@Override
			public void run() {
				for(int i=0; i<10;i++){
					
					try {
						increment(Thread.currentThread().getName());
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
		
			}

			
			
		});
		
		t1.start();
		//just used lambda to get some concise code.
		Thread t2 = new Thread(() -> {
				for(int i=0; i<10;i++){

					try {
						increment(Thread.currentThread().getName());
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				
			}
		);
		t2.start();
		
		 try {
	            t1.join();
	            t2.join();
	        } catch (InterruptedException ignored) {}
	        System.out.println("Count is: " + count);
	    }
		
	}


