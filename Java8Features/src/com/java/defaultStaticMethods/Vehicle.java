package com.java.defaultStaticMethods;

public interface Vehicle {

	String getBrand();
	String getAverage();
	
	default String getVehicleStart() {
		return "Vehicle is started...";
	}
	
	default String getVehicleStop() {
		return "Vehicle is stopped...";
	}
	
	static String getcolor() {
		return "Vehicle color is Black";
	}
	static String getweight() {
		return "Vehicle weight is 200kg";
	}
}
