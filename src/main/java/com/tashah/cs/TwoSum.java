package com.tashah.cs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TwoSum {

	/** Initialize your data structure here. */
	Map<Integer, Integer> data;

	public TwoSum() {
		data = new HashMap<Integer, Integer>();
	}

	/** Add the number to an internal data structure.. */
	public void add(int number) {
		if (data.containsKey(number)) {
			data.put(number, data.get(number) + 1);
		} else {
			data.put(number, 1);
		}

	}

	/**
	 * Find if there exists any pair of numbers which sum is equal to the value.
	 */
	public boolean find(int value) {

		Set<Integer> set = data.keySet();
		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) {
			Integer current = itr.next();
				Integer requiredKey = value - current;
				if (requiredKey == current) {
					if(data.get(requiredKey) > 1) return true;
				} else {
					if(data.containsKey(requiredKey)) return true;
				}
		}
		return false;
	}

	public static void main(String[] args) {
		TwoSum t = new TwoSum();
		t.add(3);
		t.add(2);
		t.add(1);
		System.out.println(t.find(5));

	}
}
