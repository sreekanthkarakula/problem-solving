package com.sree.LinkedList;

import java.util.List;
import java.util.Scanner;

public class LInkedListImpl {
	
	public static void main(String args[]){
		
		//List<SingleNodeDefinition> linkedlist = new A
		
		LinkedList List = new LinkedList();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("how big is your linkedlist");
		
		int size = sc.nextInt();
		
		List.createList(size);
		
		List.displayList();
		
		List.addElementatEnd(11);
		
		List.displayList();
		
		
	}

}
