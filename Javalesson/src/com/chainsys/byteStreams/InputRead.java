package com.chainsys.byteStreams;
import java.io.IOException;
import java.io.InputStreamReader;
public class InputRead {
	
	public static void main(String args[]) throws IOException
	{
	char c;
	InputStreamReader or = new InputStreamReader (System.in); System.out.println("Enter characters, 'q' to quit.");
	do
	{
	c = (char) or.read();
	System.out.println(c);
	while (c !='q');
	
	}
	}
}
	