package com.java.demo.section2;

public class CompanyTesting {
public static void main(String[] args) {
	CompanyEmpolyee empolyee1 = new CompanyEmpolyee(10001, "nivin", Company.getObject());
	CompanyEmpolyee empolyee2= new CompanyEmpolyee(10002, "naveen", Company.getObject());
	CompanyEmpolyee empolyee3 = new CompanyEmpolyee(10003, "nalan", Company.getObject());
	System.out.println(empolyee1.toString());
	System.out.println(empolyee2.toString());
	System.out.println(empolyee3.toString());
}
}
