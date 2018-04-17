package com.tashah.cs.permutation;

//find a, b such that a^2+b^2 == c?

public class Square {

	public static void main(String[] args) {
		System.out.println(judgeSquareSum(2));

	}
	public static boolean judgeSquareSum(int c) {
        int start = 0;
        int end = c%2 == 0 ? c/2 : (c/2) + 1;
        
        while(start <= end) {
        	int result = (int) (Math.pow(start, 2) + Math.pow(end, 2));
        	if(result == c) {
        		return true;
        	} else if(result > c) {
        		end = end - 1;
        	} else {
        		start = start + 1;
        	}
        }
        return false;
        
    }
}
