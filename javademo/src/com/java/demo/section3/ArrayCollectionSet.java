package com.java.demo.section3;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.java.demo.section2.CompanyEmpolyee;
import com.java.demo.section2.CompanyTesting;

public class ArrayCollectionSet {
public static void main(String[] args) {
	Set<Integer> numbers = new HashSet<Integer>();
	numbers.add(10);
	// DONT'T ALLOWS DUPLICATE
	numbers.add(1);
	if(numbers.add(2)) {
		System.out.println("number added done ngaa");
	}else {
		System.out.println("number not added done ngaa");

	}
	numbers.add(3);
	numbers.add(4);
	numbers.add(5);
	numbers.add(6);
	numbers.add(7);
	numbers.add(8);
	numbers.add(9);
	numbers.add(10);
	if(numbers.add(10)) {
		System.out.println("number added done ngaa");
	}else {
		System.out.println("number not added done ngaa");

	}
	numbers.add(1);
	System.out.println("length of the set: "+numbers.size());
	System.out.println("Hashcode of the set: "+numbers.hashCode());
	System.out.println("-----------------------------------------------------------------------------------------------");
	
	for (Integer integer : numbers) {
		System.out.println(integer);
	}	
	
	// ITERATOR
	
	Iterator<Integer> value = numbers.iterator();
	//System.out.println(value.next());
	 System.out.println("The iterator values are: ");
     while (value.hasNext()) {
         System.out.println(value.next());
     }
     Set<Integer> numbers1 = new HashSet<Integer>();
     numbers1.addAll(numbers);
     numbers1.add(11);
     System.out.println(numbers1);
     System.out.println("\nDoes  numbers contains numbers1 ?: "
             + numbers.containsAll(numbers1));
	
     System.out.println("-----------------------------------------------------------------------------------------------");
     
}
}