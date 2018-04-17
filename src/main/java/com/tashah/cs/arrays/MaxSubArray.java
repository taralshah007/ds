package com.tashah.cs.arrays;

public class MaxSubArray {

	public int maxSubArray(int[] nums) {
		int max = 0, sum = 0;
		if (nums.length < 1) {
			return nums[0];
		} else {

			for (int i = 0; i < nums.length; i++) {
				sum = sum + nums[i];
                if(sum < nums[i]) {
                    sum = nums [i];
                }
                if(sum > max) {
                    max = sum;
                } 
			}
			return Math.min(Integer.MAX_VALUE, Math.max(sum, max));
		}
	}

	public static void main(String[] args) {
		MaxSubArray m = new MaxSubArray();
		System.out.println(m.maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1,
				-5, 4 }));
	}
}
