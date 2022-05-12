package edu.chainsys.day91.collections;
import java.util.Iterator;
import java.util.ArrayDeque;

public class ArrayDequeDemo {
	public static void main(String args[]) {
		ArrayDeque<String> arraydeque= new ArrayDeque<String>();
		// use an ArrayDeque like a stack.
		arraydeque.push("A");
		arraydeque.push("B");
		arraydeque.push("X");
		arraydeque.push("Z");
		arraydeque.push("D");
		arraydeque.push("X"); // duplicate value
		arraydeque.push("Z"); // duplicate value
		arraydeque.push("E");
		arraydeque.push("F");
		
		System.out.println("Before popping the stack: "+arraydeque.size());
		while (arraydeque.peek() != null)
			System.out.print(arraydeque.pop() + " ");
		
		
		System.out.println("Before popping the stack: "+arraydeque.size());
		while (arraydeque.peek() != null)
			System.out.print(arraydeque.pop() + " ");
	
	
	}

}
