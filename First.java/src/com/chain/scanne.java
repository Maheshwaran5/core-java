package com.chain;

import java.util.Scanner;

public class scanne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findEvenNumber();
		

}
	public static void findEvenNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any 10 digit Number");
		long value=sc.nextLong();
		long num= value;
		long reminder=0;
		while(num>0)
		{
			long reminder1 = num%10;
			if(reminder1%2==0)
			{
				System.out.println(reminder1);
			}
			num=num/10;
		}
	}

}
