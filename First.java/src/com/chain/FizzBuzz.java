package com.chain;

public class FizzBuzz {

	
	public static void main(String[] args) {
		
		for( int n=1;  n<=100; n++ )
		{
		
			if(n%3==0)
		{
	
				System.out.println("Fizz"+n);
		}
		if(n%5==0)
		{
	
			System.out.println("Buzz"+n);
		}
		if(n%3==0&&n%5==0)
		{
	
			System.out.println("Fizz Buzz"+n);
		}
		else
		{
		
			System.out.println(n);
		}
	
		
		}
		
	}
	

		

	}


