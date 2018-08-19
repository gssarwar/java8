package com.gs.lamdabasics.comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Java7Comparator {

	public static void main(String[] args) {
		
	//step 1: sort list by last name
		
		//step 2: create method that print all elements in the list 
		
		// step 3 : create a method that print all people whose last name Begging with C
		
		Person person1 = new Person("Charles", "Dickens", 60);
		Person person2 = new Person("Lewis", "Carrol", 42);
		Person person3 = new Person("Thomas", "Charle", 51);
		Person person4 = new Person("Charlatte", "Branate", 45);
		Person person5 = new Person("Mathew", "Arnold", 45);
		List<Person> people = new ArrayList<Person>();
		people.add(person1);
		people.add(person2);
		people.add(person3);
		people.add(person4);
		people.add(person5);
		
		//step 1 java 7 style sorting using comparator 
		Comparator<Person> person = new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		};
		Collections.sort(people, person);
		//step 2 print all people
		printAll(people);
	//	System.out.println(people);
		System.out.println("-----------------------");
		// step 3 : create a method that print all people whose last name Begging with C
		printLastNameBegingWithC(people);

	}

	private static void printAll(List<Person> people) {
			for(Person p:people)
			{
				System.out.println(p);
			}
		
	}

	private static void printLastNameBegingWithC(List<Person> people)
	{
		for (Person p:people) {
			if(p.getLastName().startsWith("C")){
			System.out.println(p);
			}
		}
	}

}
