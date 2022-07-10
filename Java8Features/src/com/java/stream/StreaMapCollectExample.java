package com.java.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreaMapCollectExample {

	public static void main(String[] args) {

		List<User> users = new ArrayList<>();
		users.add(new User(1, "Prat", "pass1", "prat@gmail.com"));
		users.add(new User(2, "Jey", "pass4", "jey@gmail.com"));
		users.add(new User(3, "Sinu", "pass5", "sinu@gmail.com"));
		users.add(new User(4, "KK", "pass3", "kk@gmail.com"));
		
		System.out.println("===========Traditional way===========");
		List<UserDTO> userDto = new ArrayList<>();
		
		for(User usr: users) {
			userDto.add(new UserDTO(usr.getId(), usr.getUserName(), usr.getEmail()));
		}
		for(UserDTO usrdto : userDto) {
			System.out.println(usrdto);
		}
		
		System.out.println("===========Using stream().map()===========");
		users.stream().map((User usr) -> new UserDTO(usr.getId(), usr.getUserName(), usr.getEmail())).forEach(System.out::println);
	}

}
