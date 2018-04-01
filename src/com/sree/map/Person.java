package com.sree.map;

public class Person {

	public int age;
	
	public Person(int age1){
		
		this.age = age1;
		
	}
	
	
	public boolean equals(Object obj){
		
		Person pcompare = (Person) obj;
		
		if( pcompare.age == this.age){
			return true;
		}
		else{
			return false;
		}
		
		
	}
}
