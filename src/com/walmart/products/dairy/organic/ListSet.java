package com.walmart.products.dairy.organic;

import java.util.HashMap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ListSet {

	public static void main(String[] args) {

		// Map: 1.HashTable, 2.HaspMap, 3.LinkedHashMap, 4.TreeMap
		// HashMap with out duplicate Keys and Values
		Map<Integer, String> numericToWord = new HashMap<>();
		numericToWord.put(0, "Zero");
		numericToWord.put(1, "One");
		numericToWord.put(2, "Two");
		numericToWord.put(3, "Three");
		numericToWord.put(4, "Four");
		System.out.println("HashMap Implemenation with out Duplicate Key and Values: " + numericToWord);

		// HashMap with duplicate Keys (If it is same key then the next key value
		// overrides the previous same key value)
		Map<Integer, String> numericToWord1 = new HashMap<>();
		numericToWord1.put(0, "Zero");
		numericToWord1.put(1, "One");
		numericToWord1.put(0, "Two"); // Zero Overriden by Two.
		numericToWord1.put(3, "Three");
		numericToWord1.put(1, "Four");// One Overriden by Four.
		System.out.println("HashMap with duplicate Keys: " + numericToWord1);

		// HashMap with duplicate Values
		Map<Integer, String> numericToWord2 = new HashMap<>();
		numericToWord2.put(0, "Zero");
		numericToWord2.put(1, "One");
		numericToWord2.put(2, "Zero");
		numericToWord2.put(3, "Three");
		numericToWord2.put(4, "One");
		System.out.println("HashMap with duplicate Values: " + numericToWord2);

		// TreeMap Implementation
		// It sorts the key and give us the sorted keys as out put
		// TreeMap with the without duplicate keys.
		Map<Integer, String> studentNames = new TreeMap<>();
		studentNames.put(4, "A");
		studentNames.put(2, "B");
		studentNames.put(3, "C");
		studentNames.put(1, "D");
		System.out.println("TreeMap without duplicate keys: " + studentNames);

		// TreeMap with the duplicate keys.

		Map<Integer, String> studentNames1 = new TreeMap<>();
		studentNames1.put(3, "A");
		studentNames1.put(3, "B"); // A Overriden by B.
		studentNames1.put(1, "C");
		studentNames1.put(1, "D"); // C Overriden by D.
		System.out.println("TreeMap with the duplicate keys: " + studentNames1);

		// TreeMap with the duplicate values.
		Map<Integer, String> studentNames2 = new TreeMap<>();
		studentNames2.put(2, "A");
		studentNames2.put(4, "B");
		studentNames2.put(1, "C");
		studentNames2.put(3, "D");
		System.out.println("TreeMap with the duplicate values.: " + studentNames2);

		// If we Changed the Keys to Values and values to key

		Map<String, Integer> studentNames3 = new TreeMap<>();
		studentNames3.put("sai", 4);
		studentNames3.put("ravi", 3);
		studentNames3.put("laxman", 1);
		studentNames3.put("chandu", 2);
		System.out.println("TreeMap without duplicate keys: " + studentNames3);

		// TreeSet
		// Default Ascending order
		Set<Integer> studentNum = new TreeSet<>();
		studentNum.add(4);
		studentNum.add(0);
		studentNum.add(4);
		studentNum.add(1);
		System.out.println("TreeSet: " + studentNum);

	}

}
