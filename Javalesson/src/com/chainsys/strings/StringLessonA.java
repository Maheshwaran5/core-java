package com.chainsys.strings;

public class StringLessonA {
	public static void main(String[] args) {
		lessonOne();
	}
	
	 public static void lessonOne() {
		    String firstString= "Chainsys";
		    System.out.println(firstString);
		    char dataOne[]= {'C','h','a','i','n'};
		    String secondString=new String(dataOne);
		    System.out.println(secondString);
		    String thirdString = new String(new char[]{ 'C','h','a','i','n'});
		    System.out.println(thirdString);
		    }
		 
		    public static void lessonTwo() {
		    String firstString="Hello";
		    String secondString="Hello";
		    String thirdString="Hello";
		    int firstNumber=100;
		    int secondNumber=100;
		    int thirdNumber=100;
		    System.out.println(firstString);
		    System.out.println(secondString);
		    firstString="welcome";
		    System.out.println(firstString);
		    System.out.println(secondString);
		    }
		    public static void creatingStringinaForLoop() {
		    for(int count=0;count<10;count++) {
		    String s1="Hello";
		    }
		    }
		    public static void stringToChararray() {
		    java.util.Scanner Scanner =new java.util.Scanner(System.in);
		    System.out.println("Enter a WORD");
		    String firstString =Scanner.nextLine();
		    Scanner.close();
		    int stringlength=firstString.length();
		    System.out.println("Length "+stringlength);
		    char[] data=firstString.toCharArray();
		    int dataarraylength=data.length;
		    System.out.println("Length "+dataarraylength);
		    }
		    public static void stringToUpperLower1() {
		    java.util.Scanner Scanner =new java.util.Scanner(System.in);
		    System.out.println("Enter a WORD");
		    String firstString =Scanner.nextLine();
		    Scanner.close();
		    System.out.println(firstString);
		    String stringInUppercase= firstString.toUpperCase();
		    System.out.println("toUpperCase "+stringInUppercase);
		   
		    System.out.println("s1="+firstString);
		    String stringInLowercase =firstString.toLowerCase();
		    System.out.println("toLowercase="+stringInLowercase);
		    System.out.println("s1="+firstString);
		    
		    
		    //subastring
		    //
		    String subString = firstString.substring(2,6);
		    System.out.println(subString);
		    
		    // replace
		 //   String replacedString = firstString.replace('a, 'e');
		  //  System.out.println(replace)
		    
		    String replacedString = firstString.replace('a','e');
		    System.out.println(replacedString);

		    String stringUppercase = null;
			boolean flag1 = firstString.equals(stringUppercase);
		    System.out.println(flag1);

		    boolean flag = firstString.equalsIgnoreCase(stringUppercase);
		    System.out.println(flag);
		    }
		    
		    		public static void testStringTrim()
		    		{
		    			String secondString="        Hope    it    rain";
		    			System.out.println("Before Trim:  "+secondString.length());
		    			
		    			
		    			{
		    			String firstString="     Tom  and  Jerry are good friends  ";
		    			String trimmedString = firstString.trim();
		    			String[] data=trimmedString.split(" ");
		    			int count = data.length;
		    			System.out.println("Word Count "+ count);
		    			}
		    			}
		    		public static void testSplitDays() {
		    			String firstString="Mon;Tue;Wed;Thu;Fri;Sat;Sun";
		    			String trimedString =firstString.trim();
		    			String[] data = trimedString.split(";" );
		    			int count = data.length;
		    			System.out.println("Days Count " + count);
		    	         for (int index = 0; index < count; index++) {
		    	        	 System.out.println(data[index]);
		    	         }}
		    	        	 
		    	        	 
		    	        	 // Write code to reverse a String
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
		    	        	 }
							private String sentence;{
		    	        	 char[] charSentence=sentence.toCharArray();
		    	        	 for(int index=charSentence.length-1; index>=0; index-- )
		    	        	 {
		    	        		 sentence=sentence+charSentence[index];
		    	        		 }
}
		    	        		 
		    	        		 
		    	        		 public static void verifyString(String s1)
		    	        		 {
		    	        			 if(null==s1)
		    	        			 {
		    	        				 System.out.println("String is Null");
		    	        				 return;
		    	        			 }
		    	        			 else
		    	        				 System.out.println("String is not Null " + s1);
		    	        			 if(!s1.isEmpty())
		    	        				 System.out.println("\t not Empty "+s1);
		    	        			 else
		    	        				 System.out.println("\t String is Empty");
		    	        			 }
		    	        		 
		    	        		 }
		  

