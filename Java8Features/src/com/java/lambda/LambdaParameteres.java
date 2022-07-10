package com.java.lambda;

public class LambdaParameteres {

	public static void main(String[] args) {
		
		/* Traditional Way */
		AdditionImpl add2 = new AdditionImpl();
		int result = add2.addition(5, 8);
		System.out.println(result);
		
		/* Using Lambda Expression */
		Addable add1 = (a, b) -> a+b;
		System.out.println(add1.addition(12, 15));
		
	}
}
