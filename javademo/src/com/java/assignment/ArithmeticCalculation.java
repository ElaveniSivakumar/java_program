package com.java.assignment;

import java.util.Scanner;

public class ArithmeticCalculation {

	public static void main(String[] args) {
			Scanner newObj = new Scanner(System.in);
			System.out.println("enter the value1: ");
			Integer a = newObj.nextInt();
			System.out.println("enter the value2: ");
			Integer b = newObj.nextInt();
			System.out.println("1-addition,2-subtraction,3-multiplication,4-division,5-modules");
			System.out.println("ENTER THE OPTION YOU WANT: ");
			Integer i = newObj.nextInt();
				switch (i) {
			case 1:
				Integer c = a+b;
				System.out.println("ADDITION VALUE IS:" + c);
			case 2:
				Integer d = a-b;
				System.out.println("SUBTRACTION VALUE IS:" + d);	
			case 3:
				Integer e = a*b;
				System.out.println("MULTIPLICATION VALUE IS:" + e);
			case 4:
				Integer f = a/b;
				System.out.println("DIVISION VALUE IS:" + f);
			case 5:
				Integer g = a%b;
				System.out.println("MODULES VALUE IS:" + g);
				break;
			default:
				System.out.println("***************ENTER THE CORRECT OPTION***************");

			}
			}
			}



