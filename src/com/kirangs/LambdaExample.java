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

interface Shape {

	void draw(); // by default public and abstract
}

/**
 * without lambda how we implement
 */
class Rectangle implements Shape {

	@Override
	public void draw() {

		System.out.println("Drawing Rectangle");
	}
}

/**
 * without lambda how we implement
 */
class Square implements Shape {

	@Override
	public void draw() {

		System.out.println("Drawing Square");

	}
}

/**
 * without lambda how we implement
 */
class Circle implements Shape {

	@Override
	public void draw() {

		System.out.println("Drawing Circle");
	}
}

public class LambdaExample {

	public static void main(String[] args) {

		// with lambda implementation (functional programming)

		Shape rectangle = () -> {

			System.out.println("Drawing Rectangle");
		};

		Shape square = () -> System.out.println("Drawing Square");

		Shape circle = () -> {
			System.out.println("Drawing cirlce");
		};

		rectangle.draw(); // Drawing Rectangle
		square.draw(); // Drawing Square
		circle.draw(); // Drawing cirlce

		// passing lambda expression as method parameter
		
		print(rectangle); // Drawing Rectangle
		print(square); // Drawing Square
		print(circle); // Drawing cirlce
		
		print(()-> System.out.println("Drawing Rectangle")); // Drawing Rectangle
		print(()-> System.out.println("Drawing Square")); //Drawing Square
		print(()->System.out.println("Drawing cirlce")); // Drawing cirlce

	}

	/**
	 * passing lambda expression as method parameter
	 */
	private static void print(Shape shape) {

		shape.draw();
	}

}
