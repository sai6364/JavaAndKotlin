package com.walmart.products.dairy.groceries;

public class Exeption {
	public void array(int [] a)
	{
		
	}
	public static void main(String[] args) {
		int [] a = {1,2,3,4};
		try {
			System.out.println(a[2]);
			System.out.println(a[4]);
		}
		catch(ArrayIndexOutOfBoundsException b) {
			System.out.println("ArrayIndexOutOfBoundsException error"+b.getMessage());
		}
		catch(RuntimeException b) {
			System.out.println("Runtime Exception error"+b.getMessage());
		}
		catch(Exception b) {
			System.out.println("Exception error"+b.getMessage());
		}
		Exception exc = new Exception();
		
		
	}

}
