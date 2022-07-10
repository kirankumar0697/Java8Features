package com.java.lambda;

public class LambdaExample1 {
	
	private static void print(Shape shape) {
		shape.draw();
	}

	public static void main(String[] args) {
		
		Shape square = () -> System.out.println("This is for square shape.");
		//square.draw();
		print(square);
		
		Shape circle = () -> {
			System.out.println("This is for Circle shape.");
		};
		circle.draw();
		
		/*
		 * Shape rectangle = () -> { System.out.println("This is for Rectangle shape.");
		 * }; 
		 * rectangle.draw();
		 */
		print(() -> System.out.println("This is for Rectangle shape."));
		
	}
}
