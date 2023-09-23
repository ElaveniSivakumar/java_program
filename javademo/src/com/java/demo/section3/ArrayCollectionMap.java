package com.java.demo.section3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayCollectionMap {
public static void main(String[] args) {
	Map<String, Double> employeeMap = new HashMap<String, Double>();
	employeeMap.put("zzzz", 25000.00);
	employeeMap.put("yyyy", 35000.00);
	employeeMap.put("xxxx", 45000.00);
	employeeMap.put("wwww", 55000.00);
	employeeMap.put("vvvv", 65000.00);
	employeeMap.put("vvvv", 75000.00); // "OVERRIDE HAPPENED"
	System.out.println(employeeMap);
	System.out.println("-----------------------------------------------------------------------------------------------");
    
	// SET KEYVALUE AND GETTING THE KEYVALUE AFTER THE KEYSET() METHOD
	Set<String> keySet = employeeMap.keySet();
    for (String key : keySet) {
		Double salary = employeeMap.get(key);
		System.out.println(key + "::::::" + salary);
	}
    System.out.println("-----------------------------------------------------------------------------------------------");
    
    // COLLECTING VALUES USING VALUES() METHOD
    Collection<Double> salaries = employeeMap.values();
    for (Double double1 : salaries) {
    	System.out.println("::::::" + double1);
	}

    
}
}
