package com.java.assignment;

import java.util.Scanner;

public class ArithmeticException {
	public static void main(String[] args) {
		try {
		int flag;	
		int option, a,b,c;
		
		Scanner newObj = new Scanner(System.in);
			
				flag=1;
				while(flag != 0){
					System.out.println("\n 1.ADDITION,2.SUBTRACTION,3.MULTIPLICATION,4.DIVISION,5.MODULES,6.QUIT THE PROGRAM");
						
					System.out.println("\n Enter the option:");
					option=newObj.nextInt();
					
					if(option == 1) {
						
						System.out.println("enter the value1: ");
						a = newObj.nextInt();
						
						System.out.println("enter the value2: ");
						b = newObj.nextInt();
						c=a+b;
						System.out.println("\n ADDED VALUE IS:" +c);
					}
					else if(option==2) {
						a = newObj.nextInt();
						System.out.println("enter the value1: ");
						 b = newObj.nextInt();
						System.out.println("enter the value2: ");
					    c = newObj.nextInt();
						c=a-b;
						System.out.println("\n sub VALUE IS:" +c);
					}
					else if(option==3) {
						 a = newObj.nextInt();
						System.out.println("enter the value1: ");
						 b = newObj.nextInt();
						System.out.println("enter the value2: ");
						
						c=a*b;
						System.out.println("\n mul VALUE IS:" +c);
					}
					else if(option==4) {
						 a = newObj.nextInt();
						System.out.println("enter the value1: ");
						 b = newObj.nextInt();
						System.out.println("enter the value2: ");
						
						c=a/b;
						System.out.println("\n div VALUE IS:" +c);
					}
					else if(option==5) {
						a = newObj.nextInt();
						System.out.println("enter the value1: ");
						 b = newObj.nextInt();
						System.out.println("enter the value2: ");
						
						c=a%b;
						System.out.println("\n mod VALUE IS:" +c);
					}
					else if(option==6) {
						//flag=0;
						System.out.println("\n ******program exit*******");
					}
					
					else {
						System.out.println("enter the correct value");
					}
				}
		}catch(Exception e)
		{
			System.out.println("error: INTEGER VALUES ONLY ACCEPTED");
		}
	}
}