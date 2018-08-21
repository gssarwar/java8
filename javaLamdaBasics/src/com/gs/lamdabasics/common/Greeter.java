package com.gs.lamdabasics.common;

public class Greeter 
{
	public void greet(Greeting greet)
	{
		greet.performs();
	}
	public static void main(String[] args) 
	{
		System.out.println();
		Greeter greeter = new Greeter();
		HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
		greeter.greet(helloWorldGreeting);
		System.out.println("--------------");
		//Equivalent   lambda expression 
		Greeting greeting = ()->System.out.println("lamda hello world");
		greeting.performs();
		System.out.println("====================");
		//anonymous inner class implementation
		
		Greeting anonymous = new Greeting() {
			public void performs() 
			{
				System.out.println("anonymous inner class implementation");
			}
		};
		
		anonymous.performs();
		
	}

}
