package com.java.optionalClass;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		
		//Static methods of optional class: empty(), of(), ofNullable()
		String email = "Hello.com";
		
		Optional<Object> emptyOptional = Optional.empty();
		System.out.println(emptyOptional);
		
		//Can give nullpointer exception if pased null
		Optional<Object> optionalOf = Optional.of(email);
		System.out.println(optionalOf);
		
		//Will not give nullpointer exception if pased null instead gives empty object
		Optional<Object> optionalOfNullable = Optional.ofNullable(email);
		System.out.println(optionalOfNullable);
		System.out.println(optionalOfNullable.get());
		
		//isPresent()
		if(optionalOfNullable.isPresent()) {
			System.out.println(optionalOfNullable.get());
		} else {
			System.out.println("No Value Present");
		}
		
		//orElse()
		String defaultOptional = (String) optionalOfNullable.orElse("Default value");
		System.out.println(defaultOptional);
		
		String string = "Konoha";
		Optional<String> optionalStr = Optional.of(string);
		optionalStr.filter((str) -> str.contains("onoh"))
					.map(String::trim)
					.ifPresent((str) -> System.out.println(str));
		
	}
}
