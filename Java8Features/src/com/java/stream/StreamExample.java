package com.java.stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		//count(), min(), max()
		
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);		
		System.out.println(stream.count());
		
		Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 6);
		Integer min = stream1.min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(min);
		
		Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5, 6);
		Integer max = stream2.max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(max);

	}

}
