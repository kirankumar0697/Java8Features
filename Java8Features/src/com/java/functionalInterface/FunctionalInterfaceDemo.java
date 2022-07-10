package com.java.functionalInterface;

@FunctionalInterface
public interface FunctionalInterfaceDemo {

	void functionalInterface();
	
	default void defaultMethod() {
		System.out.println("Default Method");
	}
	
	static void staticMethod() {
		System.out.println("Static Method");
	}
}

/*
 * Functional Interface: only one Abstract method but can have multiple default
 * & static method.
 */