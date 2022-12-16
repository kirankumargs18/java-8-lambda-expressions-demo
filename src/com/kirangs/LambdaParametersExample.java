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

interface Addable {

	int addition(int a, int b);
}

/**
 * Traditional way of implementing interface
 */
class AddableImpl implements Addable {

	@Override
	public int addition(int a, int b) {

		return a + b;
	}

}

public class LambdaParametersExample {

	public static void main(String[] args) {

		// implementing interface with lambda

		Addable addable = (int a, int b) -> a + b;

		// if we write curly braces we should use return keyword else not required
		Addable addable2 = (int a, int b) -> {

			System.out.println("this is how we can write multiple statements");
			return a + b;
		};

		System.out.println(addable.addition(100, 200)); // 300

		System.out.println(addable2.addition(50, 100)); // 150

	}

}
