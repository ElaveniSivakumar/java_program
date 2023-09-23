package com.java.demo.section2;

public class ParentClass implements FatherInterface,MotherInterface {

	@Override
	public void getMotherName() {
		System.out.println("ratha");
		
	}

	@Override
	public void getFatherName() {
		System.out.println("rajesh");
		
		
	}
	
}
