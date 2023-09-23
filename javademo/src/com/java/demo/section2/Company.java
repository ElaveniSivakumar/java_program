package com.java.demo.section2;

public class Company {
	private String name;
private static Company company;

public Company() {
	this.name="Ebrain technology";
}
public static Company getObject() {
	if(null == company)
		company = new Company();
	return company;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}



}
