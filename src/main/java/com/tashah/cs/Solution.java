package com.tashah.cs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Solution {

	public static List<List<Integer>> getFactors(int n) {
		Set<List<Integer>> finalList = new LinkedHashSet<List<Integer>>();
		
        List<Integer> start = new ArrayList<Integer>();
        start.add(n);
        
        Queue<List<Integer>> q = new LinkedList<List<Integer>>();
        q.add(start);
        while(!q.isEmpty()) {
            List<Integer> temp = q.poll();
            Integer x = temp.get(temp.size() -1);
            for(int i =2; i < x/2; i++) {
                if(x % i == 0) {
                    List<Integer> res = new ArrayList<Integer>();
                    res.addAll(temp);
                    res.remove(temp.get(temp.size() -1));
                    res.add(i);
                    res.add(x /i);
                    Collections.sort(res); 
                    if(finalList.add(res)) {
                    	q.add(res);
                    }
                    
                }
            }
        }
        return new ArrayList<List<Integer>>(finalList);
    }
	public static void main(String[] args) {
//		List<List<Integer>> list = getFactors(12);
//		for(List x: list) {
//			System.err.println(x);
//		}
		List<String> list = new ArrayList<String>();
		list.add("c");
		list.add("de");
//		list.add("let");
//		list.add("lep");
		
		System.out.println(validWordSquare(list));
	}
	public static boolean validWordSquare(List<String> words) {
        Character[][] letters = new Character[words.size()][];
        for(int i = 0; i < words.size(); i++) {
            String str = words.get(i);
            letters[i] = new Character[str.length()];
            for(int j = 0; j < str.length(); j++) {
                letters[i][j] = new Character(str.charAt(j));
            }
        }
        
        boolean isSquare = true;
        for(int i = 0; i < letters.length; i++) {
        	Character[] row = letters[i];
            for(int j = 0; j < row.length; j++) {
            	Character[] sec = letters[j];
                if(sec.length <= i || letters[i][j] != null || letters[j][i] != null || letters[i][j] != letters[j][i]) {
                    isSquare = false;
                    break;
                }
            }
        }
        return isSquare;
    }
}
