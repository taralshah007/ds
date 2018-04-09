package com.tashah.cs.divison;


public class Divide {

	public static int divide(int dividend, int divisor) {
        int counter = 0;
        boolean isNegative = false;
        
        if((dividend < 0) ^ (divisor < 0 )) {
        	isNegative = true;
        }
        
        if(dividend <= Integer.MIN_VALUE) {
        	dividend = Integer.MAX_VALUE;
        }
        
        dividend = Math.abs(dividend) > Integer.MAX_VALUE?Integer.MAX_VALUE:Math.abs(dividend);
        divisor = Math.abs(divisor) > Integer.MAX_VALUE ? Integer.MAX_VALUE:Math.abs(divisor);
		while (dividend >= divisor) {
        	dividend = dividend -divisor;
        	counter++;
        }
		if (isNegative) {
			counter = 0 - counter;
		}
		return Math.min(Math.max(Integer.MIN_VALUE, counter), Integer.MAX_VALUE);
    }
	
	public static void main(String[] args) {
		System.out.println(divide(-2147483648, -1));
	}

}
