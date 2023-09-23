package com.java.demo.section2;

public class MethodOverloading {
	public void details() {
		System.out.println("Details: ");
	}
	public void details(String value) {
		System.out.println("Details: "+value);
	}
	public void details(String value,Integer no) {
		System.out.println("Details: "+value+", No: "+no);
	}
	public void details(String value,Integer no,Double amount) {
		System.out.println("Details: "+value+", No: "+no+", amount: "+amount);
	}
public static void main(String[] args) {
	MethodOverloading obj = new MethodOverloading();
	obj.details();
	obj.details("Evenil");
	obj.details("thenu" ,90);
	obj.details("vgr", 100,1000.0);
}
}
