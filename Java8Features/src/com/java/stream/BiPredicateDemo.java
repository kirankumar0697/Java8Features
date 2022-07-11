package com.java.stream;

import java.util.function.BiPredicate;

public class BiPredicateDemo implements BiPredicate<String, String>{

	@Override
	public boolean test(String t, String u) {
		return t.equals(u);
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("===========With implementing interface===========");
		BiPredicate<String, String> biPredicateTest = new BiPredicateDemo();
		System.out.println(biPredicateTest.test("Kiran", "Prat"));

		System.out.println("===========Using Anonymus class ===========");
		BiPredicate<String, String> biPredicateAnonymsTest = new BiPredicate<String, String>() {

			@Override
			public boolean test(String t, String u) {
				return t.equals(u);
			}
		};
		System.out.println(biPredicateAnonymsTest.test("INDIA", "india"));
		

		System.out.println("===========Using Anonymus class + Lambda expression===========");
		BiPredicate<String, String> biPredicateAnonymsLambda = (str1, str2) -> str1.equals(str2);
		System.out.println(biPredicateAnonymsLambda.test("INDIA", "INDIA"));
		
		System.out.println("===========Logical AND & OR===========");
		System.out.println(biPredicateAnonymsTest.and(biPredicateAnonymsLambda).test("INDIA", "INDIA"));
		System.out.println(biPredicateAnonymsTest.or(biPredicateAnonymsLambda).test("INDIA", "INDIA"));

	}

}
