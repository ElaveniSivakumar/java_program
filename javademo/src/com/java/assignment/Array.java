package com.java.assignment;
 import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		int evenSum=0,oddSum=0;
		// using scanner in array
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array values to store:");	
		n=sc.nextInt();
		int[] arr = new int[20];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
	System.out.println("array elements are: ");
	for(int i=0;i<n;i++) {
		System.out.println(arr[i]);
	}
	// even number
System.out.println("even number:");
for(int i=0;i<n;i++) {
	if(arr[i]%2==0)
	{
	System.out.println(arr[i]);
	}
}
//odd number
System.out.println("odd number: ");
for(int i=0;i<n;i++){
	if(arr[i]%2==1) {
	System.out.println(arr[i]);
	
}
}
//// add even number
//for(int i=1;i<n;i=i+2) {	
//sum=sum+arr[i];
//}
//System.out.println("addition of even numbers:"+sum);

//}
//}

// addition of add and even numbers
for(int i=0;i<n;i++) {
	if(arr[i]%2==0)
	{
		evenSum=evenSum+arr[i];
	}
	else
	{
		oddSum=oddSum+arr[i];
	}
}
System.out.println("Sum of even is:"+evenSum);
System.out.println("Sum of odd is:"+oddSum);
// largest no
int max = arr[0];  
//Loop through the array  
for (int i = 0; i < n; i++) {  
  //Compare elements of array with max  
 if(arr[i] > max)  
     max = arr[i];  
}  
System.out.println("Largest element present in given array: " + max);  
// smallest no
int min = arr[0];  
//Loop through the array  
for (int i = 0; i < n; i++) {  
//Compare elements of array with max  
if(arr[i]<min)  
   min = arr[i];  
}  
System.out.println("smallest element present in given array: " + min);  



}
}