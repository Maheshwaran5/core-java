package edu.chainsys.day91.collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

class ListIteratorDemo {

	public static void main(String[] args) {
		ArrayList<String> stringArrayList = new ArrayList<String>();
		String s1="B";
		stringArrayList.add("C");
		stringArrayList.add("s1");
		stringArrayList.add("A");
		stringArrayList.add("E");
		stringArrayList.add("s1");
		stringArrayList.add("D");
		stringArrayList.add("z");
		stringArrayList.add("s1");
		
		Iterator<String> string_itr = stringArrayList.iterator();
	Iterator<String> string_itr;
	while(string_itr.hasNext()) {
		System.out.print(string_itr.next() + "" );
	}
	System.out.println();
	ListIterator<String> string_list_itr = strinArrayList.list
	}
	}
	

}
