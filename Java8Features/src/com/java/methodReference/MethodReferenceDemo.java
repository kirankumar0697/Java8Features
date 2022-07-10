package com.java.methodReference;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodReferenceDemo {
	
	public static int addition(int a, int b) {
		return a+b;
	}
	
	public void display(String msg) {
		System.out.println(msg.toUpperCase());
	}

	public static void main(String[] args) {

		//Type 1: Method reference to a static method
		
		//Using lambda expression
		Function<Integer, Double> function = (input) -> Math.sqrt(input);
		System.out.println(function.apply(9));
		
		//Using method reference
		Function<Integer, Double> methodReferenceFunction = Math::sqrt;
		System.out.println(methodReferenceFunction.apply(4));
		
		//Using lambda expression
		BiFunction<Integer, Integer, Integer> biFunctionLambda = (a, b) -> MethodReferenceDemo.addition(a, b);
		System.out.println(biFunctionLambda.apply(10, 20));
		
		//Using method reference
		BiFunction<Integer, Integer, Integer> biFunctionMethodRef = MethodReferenceDemo::addition;
		System.out.println(biFunctionMethodRef.apply(60, 20));
		

		//Type 2: Method reference to instance of an object
		MethodReferenceDemo methodReferenceDemo = new MethodReferenceDemo();
		
		//Using lambda expression
		Printable printable = (input) -> methodReferenceDemo.display(input);
		printable.print(" Hola ");
		
		//Using method reference
		Printable printableMethodRef = methodReferenceDemo::display;
		printableMethodRef.print(" Arigato ");
		
		
		//Type 3: Reference to the instance method of an arbitrary object
		//Here arbInput is an arbitrary object
		//Using lambda expression
		Function<String, String> arbiFunction = (String arbInput) -> arbInput.toLowerCase();
		System.out.println( arbiFunction.apply(" KoniCHIwa"));
		
		//Using method reference
		Function<String, String> arbiFunctionRef = String::toUpperCase;
		System.out.println(arbiFunctionRef.apply("samehada"));
		
		//Reference to a constructor
		List<String> friends = new ArrayList<>();
		friends.add("Kurama");
		friends.add("Bee");
		friends.add("Son Goku");
		friends.add("Bee");
		
		//Using lambda expression
		Function<List<String>, Set<String>> lambdaConstructor = (friendsList) -> new HashSet<>(friendsList);
		System.out.println(lambdaConstructor.apply(friends));
		
		//Using method reference
		Function<List<String>, Set<String>> methodRefConstructor = HashSet::new;
		System.out.println(methodRefConstructor.apply(friends));
	}

}
