package com.java.demo.section2;

public class SingletonClassTesting {
public static void main(String[] args) {
	SingletonClass classSingletonclass1 = SingletonClass.getObject();
	System.out.println(classSingletonclass1.hashCode());
	SingletonClass classSingletonclass2 = SingletonClass.getObject();
	System.out.println(classSingletonclass2.hashCode());
	
}
}
