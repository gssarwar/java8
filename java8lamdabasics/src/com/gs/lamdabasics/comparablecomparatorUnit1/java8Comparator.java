package com.gs.lamdabasics.comparablecomparatorUnit1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class java8Comparator {

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
		Comparator<Person> lastNameComparator = (o1,o2) ->o1.getLastName().compareTo(o2.getLastName());
		Collections.sort(people, lastNameComparator);
		//step 2 print all people
	//	printAll(people);
		printConditionally(people,p ->true);
	//	System.out.println(people);
		System.out.println("-----------------------");
		// step 3 : create a method that print all people whose last name Begging with C
	//	printLastNameBegingWithC(people);
		
		//another way of implementation
		// step 3 : create a method that print all people whose last name Begging with C
		
		printConditionally(people,p ->p.getLastName().startsWith("C"));
		
		System.out.println("-----------print all person with first name start with the C------------");
		printConditionally(people,p->p.getFirstName().startsWith("C"));
	}
	private static void printConditionally(List<Person> people, Condition condition) {
		for(Person p:people)
		{
			if(condition.test(p))
			{
				System.out.println(p);
			}
		}
		
	}

	/*private static void printAll(List<Person> people) {
			for(Person p:people)
			{
				System.out.println(p);
			}
		
	}*/

	private static void printLastNameBegingWithC(List<Person> people)
	{
		for (Person p:people) {
			if(p.getLastName().startsWith("C")){
			System.out.println(p);
			}
		}
	}

}
