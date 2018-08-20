package com.gs.lamdabasics.comparablecomparatorUnit2;

public class ClosuresExample {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20 ;
		
		doProcess(a,new Process() {
			public void process(int i) {
				System.out.println(i+b);//b can be accessed without declaring as final  
			}
		});
		System.out.println("-----do process with the lamda -------");
		doProcess(a,i ->System.out.println(i+b));
	}
	private static void doProcess(int a, Process process) {
		process.process(a);
	}

}

interface Process {
	void process(int i);
}
