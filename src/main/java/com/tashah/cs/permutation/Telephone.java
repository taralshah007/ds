package com.tashah.cs.permutation;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Telephone {

	private static Map<Integer, String> charsMap = new HashMap<Integer, String>();

	static {
		charsMap.put(2, "abc");
		charsMap.put(3, "def");
		charsMap.put(4, "ghi");
		charsMap.put(5, "jkl");
		charsMap.put(6, "mno");
		charsMap.put(7, "pqrs");
		charsMap.put(8, "tuv");
		charsMap.put(9, "wxyz");

	}

	public static List<String> letterCombinations(String digits) {
		String[] letters = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        LinkedList<String> list = new LinkedList<>();
        list.add("");
        for (int i = 0; i < digits.length(); i++) {
            int num = digits.charAt(i) - '2';
            int size = list.size();
            for (int k = 0; k < size; k++) {
                String tmp = list.poll();
                for (int j = 0; j < letters[num].length(); j++)
                    list.add(tmp + letters[num].charAt(j));
            }
        }
        return list;
	}

	public static void main(String[] args) {
		List<String> list = letterCombinations("789");
		System.out.println(list);
		System.out.println(list.size());
		
	}

}
