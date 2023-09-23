package com.java.assignment;
import java.util.Scanner;

public class OccurancesCount {

	
//unique characters
    public static void uniqueCharacters(String test){
	      String temp = "";
	         for (int i = 0; i < test.length(); i++){
	            if (temp.indexOf(test.charAt(i)) == - 1){
	               temp = temp + test.charAt(i);
	         }
	      }

	    System.out.println(temp + " ");

	   }           
	public static void main(String[] args) {
	//using scanner
	Scanner sc = new Scanner(System.in);
	String sentence=" ";
	System.out.println("enter the sentence");
	sentence = sc.nextLine();
	
	// reverse the string using string buffer
	
	StringBuffer rev= new StringBuffer(sentence);
	System.out.println("reverse word: "+rev.reverse());
	
	// number of appearances of the characters in word
	System.out.println("enter the character");
	char search=sc.next().charAt(0);
	int count=0;
	for(int i=0; i<sentence.length(); i++)
	{
		if(sentence.charAt(i) == search) {
			count++;
		}
	}
	
	
	//Occurrences
	System.out.println("The character "+search+" appears "+count+" times.");
	
	//length
	System.out.println("total number of character are "+ sentence.length());
	
	//unique
	uniqueCharacters(sentence);
	
	// 3.split it out into sentence to word
				String[] letter =sentence.split("\\s");
				// for each
				for(String words:letter)
				{
					System.out.println("splitted word are:"+ words);
				}
		
				  
				        // duplicate
				
				        int count1;  
				          
				        //Converts given string into character array  
				        char string[] = sentence.toCharArray();  
				          
				        System.out.println("Duplicate characters in a given string: ");  
				        //Counts each character present in the string  
				        for(int i = 0; i <string.length; i++) {  
				            count1 = 1;  
				            for(int j = i+1; j <string.length; j++) {  
				                if(string[i] == string[j] && string[i] != ' ') {  
				                    count1++;  
				                    //Set string[j] to 0 to avoid printing visited character  
				                    string[j] = '0';  
				                }  
				            }  
				            //A character is considered as duplicate if count is greater than 1  
				            if(count1 > 1 && string[i] != '0')  
				                System.out.print(string[i]);  
				        }  
				    }  
				  
		
				
}

      