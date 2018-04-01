package com.sree.map;

public class TestEquals {
	
	public static void main(String args[]){
		
		Person p1 = new Person(1);
		
		Person p2 = new Person(1);
		
		if(p1.equals(p2) ) {
			System.out.println("true");
			
		}
		else{  System.out.println("false"); }
		
		System.out.println(" hashcode of p1" + p1.hashCode());
		
		System.out.println(" hashcode of p2" + p2.hashCode());

	}
	
}
