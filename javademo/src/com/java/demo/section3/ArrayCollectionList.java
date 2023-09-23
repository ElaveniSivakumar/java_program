package com.java.demo.section3;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.LinkedList;

public class ArrayCollectionList {
public static void main(String[] args) {
	//List one
	
	List<Integer> numbers = new ArrayList<Integer>(5);
	for(int i=1; i<=100;i++) {
		numbers.add(i);
	}
	for (int i=0;i<numbers.size();i++) {
		Integer no = numbers.get(i);
		System.out.println(no);
	}
	System.out.println("length of the list1: "+numbers.size());
	// LIST TWO 
	
	List<Integer> numberstwo = new ArrayList<Integer>();
	numberstwo.addAll(numbers);
	numberstwo.add(101);
	System.out.println("length of the list2: "+numberstwo.size());
	
	// STREAM API
	
	
	List<Integer> evennumbers = numbers.stream().filter(no -> no % 2 == 0).collect(Collectors.toList());
	List<Integer> oddnumbers = numbers.stream().filter(no -> no % 2 == 1).collect(Collectors.toList());
	System.out.println("even numbers are: " + evennumbers.size() + ",odd numbers are: " + oddnumbers.size());
    
	// ARRAY TO ARRAYLIST
	
	//ARRAY
	
	Integer[] number1 = new Integer[] {1,2,3,4,5,6,7,8};
	System.out.println("length of the array: "+number1.length);
	for (Integer integer : number1) {
		System.out.println("array elements are: "+integer);
	}
	System.out.println("-----------------------------------------------------------------------------------------------");
	// ARRAYLIST
	
	List<Integer> numberArraylist = new ArrayList<Integer>(Arrays.asList(number1));
	numberArraylist.add(9);
	numberArraylist.add(10);
	System.out.println("size of arraylist: "+numberArraylist.size());
	System.out.println("\nArrayList After adding two" + " more numbers: ");
	System.out.println(numberArraylist);
	 
	
	
	
	
}
}

