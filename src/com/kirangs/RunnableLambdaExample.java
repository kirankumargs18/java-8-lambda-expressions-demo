package com.kirangs;

/**
 * Lambda Expressions
 * 
 * It helps to iterate, filter and extract data from collection. The Lambda
 * expression is used to provide the implementation of an interface which has
 * functional interface
 * 
 * syntax: (params) -> {body}
 * 
 */

/**
 * Traditional way
 * */
class ThreadDemo implements Runnable{

	@Override
	public void run() {
		
		System.out.println("Run method called");
		
	}
}

public class RunnableLambdaExample {
	
	public static void main(String[] args) {
		
		//traditional way
		Thread thread=new Thread(new ThreadDemo());
		thread.start();
		
		//using lambda
		Runnable runnable=()-> System.out.println("Run method impl using lambda");
		
		Thread thread2=new Thread(runnable);
		thread2.start();
		
	}

}
