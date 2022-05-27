package com.chainsys.threads;
public class multiThreadsonjoin
{
public static void main(String args[]) {
	multiThreadsonjoin();
}
public static void multiThreadsonjoin()
{
	try
	  {
		Thread t=Thread.currentThread();
		System.out.println("MainTh ID: " +t.getId() );
		RunnableWorker firstWorker=new RunnableWorker();
		Thread t1=new Thread(firstWorker);
		Thread t2=new Thread(firstWorker);
		Thread t3=new Thread(firstWorker);
		t1.start();//call run
		t2.start();// call run
		t3.start();
		System.out.println("From Main--END!!!");
	 }catch(Exception e)
	 {
		 System.out.println("ERROR!!! "+e.getMessage());
     }
} 
}