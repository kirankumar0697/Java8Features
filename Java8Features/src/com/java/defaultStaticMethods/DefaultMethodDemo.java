package com.java.defaultStaticMethods;


class Car implements Vehicle {

	@Override
	public String getBrand() {
		return "TATA";
	}

	@Override
	public String getAverage() {
		return "Average is good.";
	}
	
}
public class DefaultMethodDemo {

	public static void main(String[] args) {
		
		Car car = new Car();
		System.out.println(car.getAverage());
		System.out.println(car.getBrand());
		
		System.out.println(car.getVehicleStart());
		System.out.println(car.getVehicleStop());
		
		System.out.println(Vehicle.getcolor());
		System.out.println(Vehicle.getweight());
		
		
	}

}
