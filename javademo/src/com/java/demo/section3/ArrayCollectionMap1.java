package com.java.demo.section3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayCollectionMap1 {
	public static void main(String[] args) {
	//key is one but value are different
    List<Integer> numbers = new ArrayList<Integer>();
    for (int i = 0; i <= 100; i++) {
		numbers.add(i);
	}
    
    List<Integer> evennumbers = new ArrayList<Integer>();
    List<Integer> oddnumbers = new ArrayList<Integer>();
    for (Integer integer : numbers) {
		if ( integer % 2 == 0) {
			evennumbers.add(integer);
		} else {
			oddnumbers.add(integer);
		}
    }
	Map<String, List<Integer>> numberMap = new HashMap<String, List<Integer>>();
	numberMap.put("ODDNUMBER",oddnumbers);
	numberMap.put("EVENNUMBER",evennumbers);
	Set<String> keyset = numberMap.keySet();
	for (String key : keyset) {
		System.out.println("---------------------->"+key+"<-----------------");
	List<Integer> numberTemp = numberMap.get(key);
	for (Integer number : numberTemp) {
		System.out.println(number);
	}
	}
	
	//MULTIPLE MAP
	
	Map<String, Map<Integer, Map<Integer, String>>> multipleMap = new HashMap<String, Map<Integer,Map<Integer,String>>>();
	
    
	}

}