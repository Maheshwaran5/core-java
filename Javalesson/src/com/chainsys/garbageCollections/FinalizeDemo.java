package com.chainsys.garbageCollections;

//import com.chainsys.i_calculater.Calculator;

public class FinalizeDemo {

	public static void main(String args[])throws Exception
	
	{
		Calculator c1=new Calculator();
		c1.add(100,50);
		c1=null;
		Calculator c2=new Calculator();
		Calculator c3=new Calculator();

		Runtime rt=Runtime.getRuntime();//factorymethod
	     rt.gc();
	     c1=null;
	     c2=null;
	     rt.gc();
		System.in.read();
	}
}
