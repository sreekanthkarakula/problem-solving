package com.sree.Compare;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return (o1.age-o2.age)*-1;
	}
	
}
