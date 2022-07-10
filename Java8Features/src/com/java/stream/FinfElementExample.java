package com.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FinfElementExample {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		
		Optional<Integer> first = list.stream().findFirst();
		if(first.isPresent()) {
			System.out.println(first.get());
		} else {
			System.out.println("Element Not Found");
		}
		
		Optional<Integer> any = list.stream().findAny();
		if(any.isPresent()) {
			System.out.println(any.get());
		} else {
			System.out.println("Element Not Found");
		}

	}

}
