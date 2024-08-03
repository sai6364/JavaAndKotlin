package com.walmart.products.dairy.organic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ForLoopAndStreamAPI {
	public static void main(String[] Args) {
		
	
	List<Integer> studentNos = new ArrayList<>();

	// CRUD ==Operations
	// for every CRUD change ,it requires reindexing , new memory allocation takes
	// place and re shuffles
	// this leads to the performance issue == reindex

	studentNos.add(10);// index =0
	studentNos.add(1000);// index =1
	studentNos.add(1000);
	studentNos.add(1222);
	studentNos.add(10222);
	studentNos.add(10);
	studentNos.add(1000);// index =6
	
	
	//get student whose number is 1000
	
	// Core loops while / do while / for loop / for  loops 1.5 
	
	int index=1;
	
	while(studentNos.size()>index){
		
		if(studentNos.get(index)==1000) {
			System.out.println(studentNos.get(index));
		}
		
		index = index+1;
		
	}
	
	int index2=studentNos.size();
	
	  do{
		
		if(studentNos.get(index2)==1000) {
			System.out.println(studentNos.get(index2));
		}
		
		index2 = index2-1;
		
	   }while(studentNos.size()>index2);

	
	List<Integer> studentNos1000 = new ArrayList<>();
	
	for(int index3 = 1;studentNos.size()>index3;index3++) //iteration the data
	{
		if(studentNos.get(index2)==1000)//applying the condition
			{
			System.out.println(studentNos.get(index2));
			studentNos1000.add(studentNos.get(index2));
		}
	}
	System.out.println(studentNos1000);
	//Stream api is work as like as a for loop (Syntax is stream())
	//filter (It is work as condition statement like if,else statements) syntax is filter(condition)
	//Ex: filter (temp->temp==1000) here the -> sign denotes the lambda expressions
	
	List<Integer>studentNos10002=studentNos.stream().filter(temp->temp==1000).collect(Collectors.toList());
	System.out.println(studentNos10002);
	
	//lambda expressions 
	//() if we have two parameters we use this.
	//{} if we are passing more conditions we use this 
	// Anonymous inner class implementation
	//(a,b) -> {a..}
	
	//duplicate values
	Map<Integer, String> numericToWord2 = new HashMap<>();
	numericToWord2.put(0, "Zero");
	numericToWord2.put(1, "One");
	numericToWord2.put(2, "Zero");
	numericToWord2.put(3, "Three");
	numericToWord2.put(4, "One");
	
	// jdk1.5
	
		
		Map<Integer, String> numericToWord0 = new HashMap<>();
	    for(Integer key:numericToWord2.keySet())// iteration the data
	    {
	    	if(key==10) // applying the condition 
	    	{
							System.out.println(numericToWord2.get(key));
							numericToWord2.put(key,numericToWord2.get(key));// collecting the data 
			}
	    }
					  
					//Map<Integer, String>  studentFilteredMap = 
					  //  method references ===Collectors.toMap(Map.Entry::getKey
						
		Map<Integer, String> numericToWord01 =numericToWord2.entrySet().stream().filter((entry) -> entry.getKey() == Integer.valueOf(10))
					            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
					  
		System.out.println(numericToWord01);
					  
					  
		// iterating the data , applying conditions  / manipulation data  (intermediate operations )
		// collecting the data using collect  == terminal operation == lazy invocation 

	
	}
}
