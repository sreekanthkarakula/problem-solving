package com.sree.Compare;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparingPerson {
	
	public static void main(String args[]) {
		
		List<Person> list = new ArrayList<Person>();
		
		list.add(new Person("sree",30));
		
		list.add(new Person("kanth",29));
		
		list.add(new Person("reddy",28));
		
		list.add(new Person("k",27));
		
		PersonComparator comparepersonByAgedescending = new PersonComparator();

		list.sort(comparepersonByAgedescending);
		
		for(Person p : list) {
			System.out.println(" age of person " + p.age );
			
			
		}
		
	}

}
