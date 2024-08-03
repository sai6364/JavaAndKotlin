package com.walmart.products.dairy.organic;

public interface CustomerServiceInt2 {
String getGreetings1(String name);
	
	//jdk 1.8 interface can also support default or static method
	default String getGreetings(String name) {

		return "Hi welcome "+name;
}
}