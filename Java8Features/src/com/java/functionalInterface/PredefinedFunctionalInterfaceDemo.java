package com.java.functionalInterface;

import java.util.function.Function;

class FunctionImpl implements Function<String, Integer> {
	
	@Override
	public Integer apply(String t) {
		
		return t.length();
	}
}

public class PredefinedFunctionalInterfaceDemo {
	
	public static void main(String[] args) {

	/* Traditional way */
	Function<String, Integer> function = new FunctionImpl();
	System.out.println(function.apply("Hello"));
	
	/* Using Lambda Function */
	Function<String, Integer> lambdaFunction = (String str) -> str.length();
	System.out.println(lambdaFunction.apply("KiranKumar"));
	}
}

