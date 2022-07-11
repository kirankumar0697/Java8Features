package com.java.stream;

import java.util.function.BiFunction;

public class BiFunctionDemo implements BiFunction<Integer, Integer, Integer> {

	@Override
	public Integer apply(Integer t, Integer u) {
		
		return t+u;
	}
	
	public static void main(String[] args) {
		
		System.out.println("===========With implementing interface===========");
		BiFunction<Integer, Integer, Integer> biFunctionAdd = new BiFunctionDemo();
		System.out.println(biFunctionAdd.apply(2, 4));
		
		System.out.println("===========Using Anonymus class===========");
		BiFunction<Integer, Integer, Integer> biFunctionAnonymsAdd = new BiFunction<Integer, Integer, Integer>() {

			@Override
			public Integer apply(Integer t, Integer u) {
				
				return t+u;
			}
		};
		System.out.println(biFunctionAnonymsAdd.apply(12, 4));
		
		
		System.out.println("===========Using Anonymus class + Lambda expression===========");
		BiFunction<Integer, Integer, Integer> biFunctionAnonymsLambda = (num1, num2) -> num1+num2;
		System.out.println(biFunctionAnonymsLambda.apply(15, 20));
	}

	

}
