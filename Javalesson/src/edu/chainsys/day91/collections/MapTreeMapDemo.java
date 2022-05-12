package edu.chainsys.day91.collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapTreeMapDemo {
	public static void main (String args[]) {
		TreeMap<String,Double> tm = new TreeMap<String,Double>();
		tm.put("John Doe", 3434.34); // boxing
		tm.put("Tom Smith", 123.22);
		tm.put("John Baker", 1378.00);
		tm.put("Tod Hall", 99.22);
		tm.put("Ralph Smith", -19.08);
		
		
		Set<Map.Entry<String,Double>> set = tm.entrySet();
		Iterator<Map.Entry<String,Double>> i = set.iterator();
		while (i.hasNext()) {
			Map.Entry<String,Double> m = i.next();
			//System.out.print(me.getKey() + ":");
		}
	}

}
