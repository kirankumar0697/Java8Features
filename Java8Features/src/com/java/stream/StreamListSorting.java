package com.java.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSorting {

	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList<>();
		fruits.add("Baana");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Graphes");
		fruits.add("Mango");
		System.out.println("******Ascending order*******");
		fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList()).forEach(System.out::print);
		System.out.println();
		fruits.stream().sorted().collect(Collectors.toList()).forEach(System.out::print);
		System.out.println();
		fruits.stream().sorted((c1, c2) -> c1.compareTo(c2)).collect(Collectors.toList()).forEach(System.out::print);
		System.out.println();
		
		System.out.println("******Descending order*******");
		fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::print);
		System.out.println();
		fruits.stream().sorted((c1, c2) -> c2.compareTo(c1)).collect(Collectors.toList()).forEach(System.out::print);
		System.out.println();
		System.out.println();
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(1, "Prat", 32, 87000));
		emp.add(new Employee(3, "Jey", 45, 28000));
		emp.add(new Employee(2, "KK", 23, 40000));
		emp.add(new Employee(4, "Sinu", 67, 200000));
		
		System.out.println("******Sort Empoyee by salary in ascending order*******");
		emp.stream().sorted((e1, e2)-> (int)(e1.getSalary()-e2.getSalary())).collect(Collectors.toList()).forEach(System.out::print);
		System.out.println();
		emp.stream().sorted(Comparator.comparingLong(Employee::getSalary)).collect(Collectors.toList()).forEach(System.out::print);
		System.out.println();
		System.out.println("******Sort Empoyee by salary in Descending order*******");
		emp.stream().sorted((e1, e2)-> (int)(e2.getSalary()-e1.getSalary())).collect(Collectors.toList()).forEach(System.out::print);
		System.out.println();
		emp.stream().sorted(Comparator.comparingLong(Employee::getSalary).reversed()).collect(Collectors.toList()).forEach(System.out::print);
		
		System.out.println();
		System.out.println();
		System.out.println("******Sort Empoyee by Age in ascending order*******");
		emp.stream().sorted((e1, e2)-> e1.getAge()-e2.getAge()).collect(Collectors.toList()).forEach(System.out::print);
		System.out.println();
		emp.stream().sorted(Comparator.comparingInt(Employee::getAge)).collect(Collectors.toList()).forEach(System.out::print);
		System.out.println();
		System.out.println("******Sort Empoyee by Age in Descending order*******");
		emp.stream().sorted((e1, e2)-> (e2.getAge()-e1.getAge())).collect(Collectors.toList()).forEach(System.out::print);
		System.out.println();
		emp.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).collect(Collectors.toList()).forEach(System.out::print);
		
		System.out.println();
		System.out.println();
		System.out.println("******Sort Empoyee by Name in ascending order*******");
		emp.stream().sorted((c1, c2) -> c1.getName().compareTo(c2.getName())).collect(Collectors.toList()).forEach(System.out::print);
		System.out.println();
		emp.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList()).forEach(System.out::print);
		System.out.println();
		System.out.println("******Sort Empoyee by Name in Descending order*******");
		emp.stream().sorted((c1, c2) -> c2.getName().compareTo(c1.getName())).collect(Collectors.toList()).forEach(System.out::print);
		System.out.println();
		emp.stream().sorted(Comparator.comparing(Employee::getName).reversed()).collect(Collectors.toList()).forEach(System.out::print);
		System.out.println();
		
	}
}
