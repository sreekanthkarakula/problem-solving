package com.sree.Compare;

import java.util.Comparator;

public class Person implements Comparable<Person>{

	public String name;
	
	public int age;
	
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return this.age-o.age;
		//for descending order multiply with -1
	}

}
