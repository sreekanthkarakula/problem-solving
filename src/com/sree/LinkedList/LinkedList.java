package com.sree.LinkedList;

import java.util.Scanner;

public class LinkedList {
	
	SingleNodeDefinition start = null;
	
	public void LinkedList(){
		
		SingleNodeDefinition start = null;
		
		
	}
	
	public void LinkedList( int valuefornode){
			
			if(start == null){
				
				start = new SingleNodeDefinition(valuefornode);
				start.nextnoderef = null;
			}
			
			else while(start.nextnoderef != null){
				
				
				
				
				
			}
			
			
		}

	public int add(int value){
		
		SingleNodeDefinition node = new SingleNodeDefinition(value);
		
		if(start == null){
			
			start = node;
		}
		
		else {
			
			SingleNodeDefinition nodetotraverse = start;
			
			while(nodetotraverse.nextnoderef != null ){
				
				nodetotraverse = nodetotraverse.nextnoderef;	
				
			}
			
			nodetotraverse.nextnoderef = node;
			
		}
		
		
		return value;
		
	}
	
	public void createList(int size){
		
		while (size>0){
			
			System.out.println("enter the value for node");
			
			Scanner sc = new Scanner(System.in);
			
			//SingleNodeDefinition newnode = new SingleNodeDefinition(sc.nextInt());
			
			add(sc.nextInt());
			
			size--;
			
			
		}
		
	}
	
	public void displayList(){
		
		SingleNodeDefinition nodetotraverse = start;
		
		if(start != null){
			
			while(nodetotraverse.nextnoderef != null ){
				
				System.out.println("print element" + nodetotraverse.data);
				
				nodetotraverse = nodetotraverse.nextnoderef;	
				
			}
			
			System.out.println("print element" + nodetotraverse.data);
			
			
		}
			
			else System.out.println("empty list");
		
		
	}
	
	public void addElementatEnd(int value){
		
		if(start != null){
			
			SingleNodeDefinition newnode = new SingleNodeDefinition(value);
			
			SingleNodeDefinition nodetotraverse = start;
			
			while(nodetotraverse.nextnoderef != null ){
				
				//System.out.println("print element" + nodetotraverse.data);
				
				nodetotraverse = nodetotraverse.nextnoderef;	
				
			}
			
			 nodetotraverse.nextnoderef = newnode;
			
			
		}
			
			else System.out.println("empty list");
		
		
	}
	
	
	
}
