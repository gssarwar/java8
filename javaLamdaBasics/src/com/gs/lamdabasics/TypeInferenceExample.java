package com.gs.lamdabasics;

public class TypeInferenceExample {

	public static void main(String[] args) 
	{
		// StringLengthLambda lambda = (String s) -> s.length();
		//type inference  example
	//	StringLengthLambda lambda = (s) -> s.length();
		StringLengthLambda lambda = s -> s.length();
		System.out.println(lambda.getLengh("Ghulam sarwar"));
	}
}
interface StringLengthLambda {
	public int getLengh(String s);
}
