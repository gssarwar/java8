package com.gs.lamdabasics.comparablecomparatorUnit2;

public class ThisRefrenceExaple {
	public void doProcess(int i,Process1 p)
	{
		p.process(i);
	}
	
	public void execute()
	{
		doProcess(10, i->{
			System.out.println(i);
			System.out.println(this); //this will not work ...it depicts anonymous and lambda expression are not same 
		});
	}
	public static void main(String[] args) 
	{
		ThisRefrenceExaple thisRefrenceExample = new ThisRefrenceExaple();
		thisRefrenceExample.doProcess(10, new Process1() {
			public void process(int i) {
				System.out.println(i);
				System.out.println(this);
			}
			public String toString()
			{
				return "this is inner class instance";
			}
		});
		
		//this is lambda expression implementation 
		
		System.out.println("doProcess exaple wirh the lambda expression");
		thisRefrenceExample.doProcess(10, i->{
			System.out.println(i);
		//	System.out.println(this); this will not work ...it depicts anonymous and lambda expression are not same 
		});
		System.out.println("-----------------------");
		thisRefrenceExample.execute();
	}
	
	public String toString()
	{
		return "this is the main thisRefrenceExample class instance ";
	}
	

}
interface Process1 {
	void process(int i);
}

