package com.java.assignment;

import java.util.Scanner;

public class Word {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter the sentence");
		String sentence = sc.nextLine();
		
		//for each
		//1.length of the string
		int c=0;
		
		char[] a= sentence.toCharArray();
		for(char ch:a)
		{
			c++;
		}
		System.out.println("string contains "+c+" characters");
		
		// 2.reverse of the string
         
		
		int n = c; // length of character array

		int start=0,end = n-1;

		while(start<=end){

		    // Swapping the characters

		    char temp = a[start];

		    a[start] = a[end];

		    a[end] = temp;

		    start++;

		    end--;

		}


		//  Converting characterArray to String

		String reversedString = String.valueOf(a);


		System.out.println("Reversed string: "+reversedString); //  Printing the reversed String

		
		
		
		// 3.split it out into sentence to word
		String[] letter =sentence.split("\\s");
		// for each
		for(String words:letter)
		{
			System.out.println("splitted word are:"+ words);
		}
		
		// 4. number occurrence of word
		int i;
		
		int counter[]=new int[256];
		
		for( i=0;i<c;i++)
		{
			counter[(int) sentence.charAt(i=0)]++;
		}
			
		
		for(i=0;i<256;i++) 
		{
		if(counter[i]%2==1)
		{
		//System.out.println((char) i + " -- > "+ counter[i]);
			
				System.out.println(counter[i]);		
				
		}
		}
		
		
		
		
		
		
		// 5. unique character in the word
		
		
		 
		        
		
		
		
		
		
		
		
		
		
		
	}
}



