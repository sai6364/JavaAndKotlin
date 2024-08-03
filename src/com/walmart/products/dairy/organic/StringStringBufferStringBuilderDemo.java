package com.walmart.products.dairy.organic;


public class StringStringBufferStringBuilderDemo {
	//one negative of string immutable It is keep increases the heap memory
	public static void main(String[] args) {
		String cust = "ram";//String Literal == stores into the string pool
		//String is pre-defined class which is a final class and it is non modifiable/ immutable
		System.out.println(cust);
		System.out.println(cust.hashCode());//memory address == abandoned
		 cust = "sai";//String Literal == stores into the string pool
		 System.out.println(cust);
			System.out.println(cust.hashCode());// new memory 
			// heap memory == new keyword;
			String custNewKey = new String("ram11");
			 System.out.println(custNewKey);
				System.out.println(custNewKey.hashCode());
				
				//String Buffer
				StringBuffer custBuf = new StringBuffer();
				custBuf.append("test");
				System.out.println(custBuf);
				System.out.println(custBuf.hashCode());
				
				custBuf.append("test111");
				System.out.println("after change "+custBuf);
				System.out.println(custBuf.hashCode());
				
				//String builder
				StringBuilder custBuilder = new StringBuilder();
				custBuilder.append("test");
				System.out.println(custBuilder);
				System.out.println(custBuilder.hashCode());
				
				custBuilder.append("test111");
				System.out.println("after change "+custBuilder);
				System.out.println(custBuilder.hashCode());// same memory location methods are 
	}

}
