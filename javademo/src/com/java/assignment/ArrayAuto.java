package com.java.assignment;
 import java.util.Scanner;
public class ArrayAuto {

	public static void main(String[] args) {
		int evenSum=0,oddSum=0;
		// using scanner in array
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array values to store:");	
		n=sc.nextInt();
		int[] intArray = new int[30];

		for(int i=0; i < intArray.length; i++) {
		    intArray[i] = i;
		}

//		for(int i=0; i < intArray.length; i++) {
//		    System.out.println( intArray[i] );
//		}

	// even number
System.out.println("even number:");
for(int i=0;i<n;i++) {
	if(intArray[i]%2==0)
	{
	System.out.println(intArray[i]);
	}
}
//odd number
System.out.println("odd number: ");
for(int i=0;i<n;i++){
	if(intArray[i]%2==1) {
	System.out.println(intArray[i]);
	
}
}


// addition of add and even numbers
for(int i=0;i<n;i++) {
	if(intArray[i]%2==0)
	{
		evenSum=evenSum+intArray[i];
	}
	else
	{
		oddSum=oddSum+intArray[i];
	}
}
System.out.println("Sum of even is:"+evenSum);
System.out.println("Sum of odd is:"+oddSum);
//predefined values of arrays (array size as a array values)
//		int[] intArray = new int[10];
//
//		for(int i=0; i < intArray.length; i++) {
//		    intArray[i] = i;
//		}
//
//		for(int i=0; i < intArray.length; i++) {
//		    System.out.println( intArray[i] );
//		}

  

}
}
