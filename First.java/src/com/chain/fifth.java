package com.chain;

public class fifth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int x=1;
     System.out.println(x);
     System.out.println(++x); //prefix =++x subfix =x++
     System.out.println(--x);
     printNumbersoneToHundred();
     
     }
	public static void printNumbersoneToHundred() {
    int count =0;
    for(count =1;count<=10;count++)
    {
	System.out.print(count + "");
    }
}
}
