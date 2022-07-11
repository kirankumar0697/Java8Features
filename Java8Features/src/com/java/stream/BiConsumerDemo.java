package com.java.stream;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerDemo implements BiConsumer<Integer, Integer> {

	@Override
	public void accept(Integer t, Integer u) {
		System.out.println(t+u);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("===========With implementing interface===========");
		BiConsumer<Integer, Integer> biConsumerAdd = new BiConsumerDemo();
		biConsumerAdd.accept(12, 22);
		
		System.out.println("===========Using Anonymus class ===========");
		BiConsumer<Integer, Integer> biConsumerAnonymsAdd = new BiConsumer<Integer, Integer>() {

			@Override
			public void accept(Integer t, Integer u) {
				System.out.println(t+u);
			}
		};
		
		biConsumerAnonymsAdd.accept(30, 20);
		
		System.out.println("===========Using Anonymus class + Lambda expression===========");
		BiConsumer<Integer, Integer> biConsumerAnonymsLambda = (num1, num2) -> System.out.println(num1+num2);
		biConsumerAnonymsLambda.accept(42, 44);
		
		
		System.out.println("===========Map example using BiConsumer forEach()===========");
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "INDIA");
		map.put(2, "Russia");
		map.put(3, "USA");
		map.put(4, "Nepal");
		
		map.forEach((key, value) -> {
			System.out.print(key + " - ");
			System.out.println(value);
		});
	}	
}
