package com.sree.Arrays;

import java.util.Scanner;

public class QueueArrayImpl {
	
	
	public int  arr[];
	
	public int begin = 0;
	
	public int rear = -1;
	
	public int length;
	
	
	public QueueArrayImpl(int size){
		
		this.arr = new int[size];
		
		this.length = size-1;
		
	}
	
	public void enque(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the value for enqueue");
		
		int value = sc.nextInt();
		
		if(begin < length && begin < rear){
			
			arr[begin] = value;
			
			begin++;
			
		}
		
		else if(begin == length && rear > -1){
			
			//there is space at the begining of the array
			
			
			
			
		}
		
		else if ( begin == rear){
			System.out.println("queue is full");
			
			
		}
		
		
		
	}

	public void deque(){
		
		//just delete the element at the ++rear position
		
		arr[++rear] = 0;
		
		
		
		
	}
}
