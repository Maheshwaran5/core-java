package com.chainsys.strings;

public class Reverse {

	
	 public static void reverse() 
	 {
		 java.util.Scanner scanner=
				 new java.util.Scanner(System.in);
		 System.out.println("Enter a Sentence");
		 String sentence="";
		 try {
			 sentence = scanner.nextLine();
		 } finally  {
		 scanner.close();
		 }
		 char c[]=sentence.toCharArray();
		 for(int i=c.length-1;i>=0;i--) {
			 System.out.print(c[i]);
			 
		 }
}
}
