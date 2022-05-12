package simple;

import java.util.Scanner;

public class ArrayMonth {

	public static void main(String[] args) {
	
		 /* Constant number of month declarations */
	    int MONTHS[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	    int month;
		Scanner p=new Scanner(System.in);

	    System.out.print("Enter month number (1-12): ");
	    month=p.nextInt();
	 
	    if(month >= 1 && month <= 12)
	    {
	        /* Print number of days */
		System.out.println(MONTHS[month - 1]+" days");
	    }
	    else
	    {
	        System.out.println("Invalid input! Please enter month number between (1-12).");
	    }
	}
	}
