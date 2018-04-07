package com.tashah.cs.permutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayPermutation {

public static List<List<Integer>> permute(int[] nums) {
        
        List<Integer> numsList = null;
        List<List<Integer>> finalList = null;
        
        //base case:
        if (nums.length == 0 ) {
            return null;
        }
        if (nums.length == 1 ) {
            numsList = new ArrayList<Integer>();
            numsList.add(nums[0]);
            finalList.add(numsList);
            return finalList;
        }
        HashSet<List<Integer>> finalSet = new HashSet<List<Integer>>();
        //Create Integer Array
        Integer[] newNums = new Integer[nums.length];
        for(int i=0; i<nums.length; i++) {
        	newNums[i] = (new Integer(nums[i]));
        }
        
        for(int i=0; i<nums.length;i++) {
            List<Integer> x = new ArrayList<Integer>();
            x.add(nums[i]);
            List<Integer> y = new ArrayList<Integer>();
            
            y.addAll(Arrays.asList(newNums));
            y.remove(i);
            
            doPermute(x,y,finalSet);
        }
        return (List<List<Integer>>) new ArrayList(finalSet);
    }
    
    private static void doPermute(List<Integer> x, List<Integer> y,Set<List<Integer>> f) {
        if(y.isEmpty()) {
            f.add(x);
        }
        else {
        	for(int i=0;i< y.size();i++) {
        		//need to create new as it's passed by ref.
        		List<Integer> newX = new ArrayList<Integer>(x);
        		newX.add(y.get(i));
        		List<Integer> newY = new ArrayList<Integer>(y);
        		newY.remove(i);
        		doPermute(newX,newY,f);
        	}
        }
    }
    
    public static void main(String[] args) {
		int[] a = {1,2,4};
		List<List<Integer>> x = permute(a);
		for(List<Integer> y:x) {
			System.out.println(y);
		}
	}
}
