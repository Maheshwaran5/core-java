package com.chainsys.i_calculater;

public class Calculator implements ICalculator {

	public int v1;
	public int v2;

	public int add(int var1, int var2) 
	{
	    System.out.println("addition: "+ (var1  + var2));
	    return var1 + var2;
	}
	public int multiply(int var1,int var2)
	{
	    System.out.println( "multiple: "+var1  * var2);
	    return var1 * var2;

	}

	public int divide(int var1, int var2) {
	    System.out.println( "divition: "+var1 / var2);
	    return var1 / var2;
	}
	}


