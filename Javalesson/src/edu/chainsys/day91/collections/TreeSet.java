package edu.chainsys.day91.collections;

import java.util.Iterator;

public class TreeSet {

	public static void demoA() {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Cut");
		ts.add("fun");
		ts.add("Assam");
		ts.add("Ball");
		ts.add("dog");
		ts.add("Aag");
		ts.add("Aag");
		ts.add("Event");
		ts.add("Fan");
		//ts.add(null);
		ts.add("Delhi");
		ts.add("carrot");
		
		System.out.println("Size "+ts.size());
		Iterator<String> itr = ts.iterator();
		while(itr.hasNext());
		
		
	}
}
