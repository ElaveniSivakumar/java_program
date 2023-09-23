package com.java.assignment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class Assignment5 {
public static void main(String[] args) {
	
	List<Integer> number = new ArrayList<Integer>();
	Scanner sc = new Scanner(System.in);
	System.out.println("ENTER THE STARTING NUMBER: ");
	Integer a = sc.nextInt();
	System.out.println("ENTER THE ENDING NUMBER: ");
	Integer b = sc.nextInt();
	for(int i=a;i<=b;i++) {
		number.add(i);
	}
	  
	System.out.println("list contains: "+number);
	
	System.out.println("length of the list: "+number.size());
	List<Integer> evennumbers = new ArrayList<Integer>();
    List<Integer> oddnumbers = new ArrayList<Integer>();
    for (Integer integer : number) {
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
	for (Integer number1 : numberTemp) {
		System.out.println(number1);
	}
	}
	
	
}
}
