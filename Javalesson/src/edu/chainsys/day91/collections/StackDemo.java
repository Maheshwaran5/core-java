package edu.chainsys.day91.collections;
import java.util.EmptyStackException;
import java.util.Stack;
import java.util.Iterator;
public class StackDemo {
public static void main(String args[]) {
	Stack<Integer> st = new Stack<Integer>();
	System.out.println("stack: " + st.size());
	st.push(42);
	st.push(66);
	st.push(99);
	
	System.out.println("stack: " + st.size());
	Iterator<Integer> int_itr=st.iterator();
	while(int_itr.hasNext())
	{
	
		
	}
	
}

}
