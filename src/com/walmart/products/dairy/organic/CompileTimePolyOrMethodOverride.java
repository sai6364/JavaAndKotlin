package com.walmart.products.dairy.organic;
// establish the parent and child relationship using the extends keyword 
public class CompileTimePolyOrMethodOverride extends ParentMethodOverloading{
	public int addTwoIntegerFinal(int a, int b) {
		//method override or compile time polymorphism 
		return a + b;
	}
	
	public static void main(String[] args) {
		CompileTimePolyOrMethodOverride childobj1 = new CompileTimePolyOrMethodOverride();
		int res = childobj1.addTwoIntegerFinal(10, 10);
		System.out.println(res);

		ParentMethodOverloading parentobj1 = new ParentMethodOverloading();
		int result = parentobj1.addTwoIntegerFinal(10, 10);
		System.out.println(result);
	}

}
