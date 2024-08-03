package com.walmart.products.dairy.organic;

public class ConstuctorDemo {
	//default constructor
	public ConstuctorDemo() {
		System.out.println("I am from default constuctor");
	}
	//custom constructor
	//super is used instead of default constructor
	public ConstuctorDemo(int a,int b) {
		super();
		System.out.println("I am from custom constuctor"+b);
	}

	public static void main(String[] args) {
	/*ConstuctorDemo obj1= new ConstuctorDemo();
	System.out.println("memory address "+obj1.hashCode());
*/
	ConstuctorDemo obj2= new ConstuctorDemo(10,12);
	System.out.println("memory addresss "+obj2.hashCode());

	}

}
