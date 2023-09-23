package com.java.demo.section2;

public class Father extends GrandFather {
@Override
public void favoriteFood() {
	System.out.println("veg");
}
@Override
	public void favoriteSports() {
		// TODO Auto-generated method stub
	System.out.println("vollyball");
	}
@Override
	public void favoriteSubject() {
		// TODO Auto-generated method stub
		super.favoriteSubject();
		System.out.println("tamil");
	}
public void favoritePlace() {
	System.out.println("ooty");
}
}
