package com.java.stream;

import java.util.ArrayList;
import java.util.List;

public class ListForEachExample {

	public static void main(String[] args) {

		List<User> users = new ArrayList<>();
		users.add(new User(1, "Prat", "pass1", "prat@gmail.com"));
		users.add(new User(2, "Jey", "pass4", "jey@gmail.com"));
		users.add(new User(3, "Sinu", "pass5", "sinu@gmail.com"));
		users.add(new User(4, "KK", "pass3", "kk@gmail.com"));
		
		System.out.println("==============Before Java 8================");
		for(User usr : users) {
			System.out.print(usr.getUserName() + " ");
			System.out.println(usr.getEmail());
		}
		System.out.println("==============Using forEach & Lambda================");
		users.forEach((usr2) -> {
			System.out.print(usr2.getUserName() + " ");
			System.out.println(usr2.getEmail());
		});
		
		System.out.println("==============Using Stream & Lambda================");
		users.stream().forEach((usr3) -> {
			System.out.print(usr3.getUserName() + " ");
			System.out.println(usr3.getEmail());
		});
	}

}
