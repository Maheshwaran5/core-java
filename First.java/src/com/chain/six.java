package com.chain;

import java.util.Scanner;

public class six {

	public static void main(String[] args) {
		checkUserName11();
	}
		
      
	public static void  checkUserName11()
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter your Name");
		String userName = sc.nextLine();
		sc.close();
		System.out.println("Name is " + userName);
		char[] nameAsCharacters = userName.toCharArray();
		int lengthOfCharArray=nameAsCharacters.length;
		System.out.println("Length of your name is: "+ lengthOfCharArray);
		if(lengthOfCharArray <3)
		{
			System.out.println("Name must have atleast 3 chars");
			return;
		}
			if(lengthOfCharArray >15)
			{
				System.out.println("Name must Not have More than 15 chars");
				return;
			}
			String nameInUppercase = userName.toUpperCase();
			nameInUppercase = nameInUppercase.trim();
			char[] uppercaseCharArray = nameInUppercase.toCharArray();
			lengthOfCharArray = uppercaseCharArray.length;
			int asciivalue = 0;
			for (int index = 0; index < lengthOfCharArray; index++) {
				asciivalue = (int) uppercaseCharArray[index];
				System.out.println("ASCII :" + asciivalue);
				if (asciivalue < 65 || asciivalue > 90) {
					if (asciivalue !=32) {
						System.out.println("in valid Character in Name: ");
						return;
					}
				
		for(int index1=0; index1<lengthOfCharArray;index1++)
		{	
			System.out.println(index1 +" " +nameAsCharacters[index]);
			
		}
				}
			}
		}
	}	
		