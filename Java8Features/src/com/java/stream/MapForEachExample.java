package com.java.stream;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapForEachExample {

	public static void main(String[] args) {
		
		Map<Integer, User> usrMap = new HashMap<>();
		usrMap.put(1, new User(1, "Prat", "pass1", "prat@gmail.com"));
		usrMap.put(2, new User(2, "Jey", "pass2", "jey@gmail.com"));
		usrMap.put(3, new User(3, "KK", "pass3", "kk@gmail.com"));
		
		System.out.println("==============Before Java 8================");
		for(Entry<Integer, User> usr : usrMap.entrySet()) {
			System.out.print(usr.getKey() + " ");
			System.out.println(usr.getValue().getUserName());
		}
		
		System.out.println("==============Using forEach & Lambda expression================");
		usrMap.forEach((key, value) -> {
			System.out.print(key + " ");
			System.out.println(value.getUserName());
		});
				
	}

}
