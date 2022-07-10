package com.java.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Product {
	int id;
	String name;
	float price;
	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}	
}

public class StreamFilterExample {
	
	public static List<Product> getProducts() {
		List<Product> products = new ArrayList<>();
		products.add(new Product(1, "Laptop", 26000f));
		products.add(new Product(2, "Battery", 68000f));
		products.add(new Product(3, "Mobile", 43000f));
		products.add(new Product(4, "Charger", 5000f));
		products.add(new Product(5, "Headphone", 2000f));
		products.add(new Product(6, "Mouse", 900f));
		
		return products;
	}

	public static void main(String[] args) {
		
		//Traditional way
		List<Product> productList = new ArrayList<>();		
		for(Product prod : getProducts()) {
			if(prod.getPrice()> 25000f) {
				productList.add(prod);
			}
		}
		
		for(Product prod : productList) {
			System.out.println(prod);
		}
		System.out.println("*********************************");
		//Using Stream
		List<Product> productsList = getProducts().stream()
									.filter((product) -> product.getPrice()>2500f).
									collect(Collectors.toList());
		productsList.forEach(System.out::println);
		
		System.out.println("*********************************");
		//Using Stream
		getProducts().stream().filter((product) -> product.getPrice()>2500f).forEach(System.out::println);

	}

}
