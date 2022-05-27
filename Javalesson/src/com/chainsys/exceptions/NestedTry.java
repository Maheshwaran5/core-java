package com.chainsys.exceptions;

import java.util.Scanner;

public class NestedTry {
	static String[] data;
	private static Exception e2;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int num = 0;
           int numValue=0;
           data=new String[2];
           java.util.Scanner sc=null;
           try
           {
        	   sc=new Scanner(System.in);
        	   try
        	   {
        		   System.out.println("Enter value for X");
        		   data[0]=sc.nextLine(); // 123 ---- abcd --- 123
        		   numValue = Integer.parseInt(data[0]); //data[2]
        		   System.out.println("The square is "+ numValue * numValue);
        	   } 
        		   catch(NumberFormatException nb)
                     {
        			   System.out.println("Not a number!");
                     }
        	   num=data.length;
        	   System.out.println("Array Length "+num);
           }catch(ArrayIndexOutOfBoundsException ne)
           {
        	   System.out.println("ArrayIndexOutofBounds- No arguments given!!! ");
           }
           catch(Exception err)
           {
        	   System.out.println("Excepton "+err.getMessage());
           }
	}
}
	
//    public static void testM4()
//    {
// 	   try
// 	   {
// 	   m4();
//    }
// 	   catch(Exception e) {
// 		   System.out.println("ERROR:"+e.getMessage());
// 		  Throwable t1= e.getCause();
// 		    System.out.println("cause"+e.getMessage());
//    }
//    
//}
           
//           public static void m4()  // throws exception
//           {
//        	   Exception e1=new Exception("Error1");
//        	   // Inner Exception 
//        	   // e1 is nested inside e2
//        	   Exception e2=new Exception("Error2",e1);
//        	   throw e2;
//           }
   
           
           
           

                   
                     
