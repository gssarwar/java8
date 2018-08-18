package com.gs.lamdabasics;

public class Greeter 
{
	public void greet(Greeting greet)
	{
		greet.performs();
	}
	public static void main(String[] args) 
	{
		Greeter greeter = new Greeter();
		HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
		greeter.greet(helloWorldGreeting);
	}

}
