package com.tashah.cs.permutation;

import java.util.ArrayList;
import java.util.List;

public class StringPermutation {

	private static List<String> permuteString(String x) {
		List<String> returnValues = new ArrayList<String>();
		if (x.length() < 1) {
			returnValues.add(x);
		} else
			doPermute(x, "", x, returnValues);
		return returnValues;
	}

	private static void doPermute(String x, String left, String right,
			List<String> list) {
		if(x.length() == left.length()) {
			list.add(left);
		} else {
			for(int i=0; i < right.length(); i++) {
				doPermute(x, left+right.charAt(i), right.substring(0,i)+right.substring(i+1), list);
			}
		} 
	}

	public static void main(String[] args) {
		List<String> list = permuteString("abc");
		for(String x:list) {
			System.out.println(x);
		}
	}
}
