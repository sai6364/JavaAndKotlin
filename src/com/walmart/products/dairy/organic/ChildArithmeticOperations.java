package com.walmart.products.dairy.organic;

public class ChildArithmeticOperations extends ParentArthemeticOperations,ParentArithematicOperations2 {
public static void main(String[] args)
{
	ChildArithmeticOperations obj1 = new ChildArithmeticOperations();
	int result1 = obj1.addTwoInteger(10, 20);
	System.out.println(result1);
}
}
