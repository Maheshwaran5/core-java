package com.chainsys.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
public static void main(String args[]) {
	LinkedList<String> stringLinkedList = new LinkedList();
	stringLinkedList.add("A");
	stringLinkedList.add("B");
	stringLinkedList.add("D");
	stringLinkedList.add("E");
	stringLinkedList.add("C");
	stringLinkedList.add("F");
	stringLinkedList.add("B");
	stringLinkedList.add("D");
	stringLinkedList.add("E");
	stringLinkedList.addLast("Z");
	stringLinkedList.addFirst("A");
	stringLinkedList.add(1, "A2");
	Iterator<String> stringIterator=stringLinkedList.iterator();
	while (stringIterator.hasNext()) {
		System.out.print(stringIterator.next() + "");
	}
	
	}
}
