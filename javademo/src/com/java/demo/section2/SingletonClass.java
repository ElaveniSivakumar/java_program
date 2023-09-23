package com.java.demo.section2;

public class SingletonClass {
	
private static SingletonClass singletonclass;
private SingletonClass() {
	
}
public static SingletonClass getObject(){
	if(null==singletonclass) {
		singletonclass = new SingletonClass();
	}
	return singletonclass;
}
}
