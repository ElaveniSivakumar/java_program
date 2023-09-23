package com.java.assignment;
import java.util.Scanner;
public class BigWord {
public static void main(String[] args) {
	Scanner newObj = new Scanner(System.in);
	String word;
	System.out.println("ENTER THE WORD:");
	word=newObj.next();
	StringBuffer rev= new StringBuffer(word);
	System.out.println("reverse word: "+rev.reverse());
	System.out.println("Length of the string:"+rev.length());
	
}

}