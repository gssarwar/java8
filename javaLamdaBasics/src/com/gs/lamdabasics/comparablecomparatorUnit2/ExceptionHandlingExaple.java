package com.gs.lamdabasics.comparablecomparatorUnit2;

import java.util.function.BiConsumer;

public class ExceptionHandlingExaple 
{

	public static void main(String[] args)
	{
		
		int [] someNumbers ={1,2,3,4};
		int key = 0;
		
		beforeJava8process(someNumbers,key);
		System.out.println("---------------");
		//addition of array elements and the key 
		processAdditionWithJava8(someNumbers,key, (v,k) -> System.out.println(v+k));//passing the lambda for adding key and array elements for example
		System.out.println("--------------");
		//division of array number by key 
		processWithJava8(someNumbers,key, wrapperLamdaa((v,k) -> System.out.println(v/k)));//passing the lambda for adding key and array elements
		
		
		
	}



	private static void beforeJava8process(int[] someNumbers, int key) {
		for (Integer int1 :someNumbers) {
			System.out.println(int1+key);
		}
		
	}
	
	private static void processAdditionWithJava8(int[] someNumbers, int key,BiConsumer<Integer, Integer> consumer) 
	{
		for (Integer int1 :someNumbers) {
			consumer.accept(int1, key);
		}
	}
	private static void processWithJava8(int[] someNumbers, int key,BiConsumer<Integer, Integer> consumer) 
	{
		for (Integer int1 :someNumbers) {
			consumer.accept(int1, key);
		}
	}
	

	private static BiConsumer<Integer, Integer> wrapperLamdaa(BiConsumer<Integer, Integer> consumer) {
		return (v,k)-> {
			try {
				consumer.accept(v, k);
			} catch (Exception e) {
				System.out.println("Exception is cought in wrapper lamda");
			}
		};
	}



}
