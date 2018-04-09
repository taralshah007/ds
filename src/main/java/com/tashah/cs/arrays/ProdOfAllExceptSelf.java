package com.tashah.cs.arrays;

public class ProdOfAllExceptSelf {

	public static int[] productExceptSelf(int[] nums) {
		int left = 1, right = 1;
		int[] result = new int[nums.length];
		for(int i=0; i< nums.length; i++) {
			result[i] = left;
			left = left * nums[i];
			
		}
		for(int j=nums.length-1; j>=0; j --) {
			//right = right * nums[j];
			result[j] = result[j] * right;
			right = right * nums[j];
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = {4,5,7,8,9};
		System.out.println(productExceptSelf(nums));
	}

}
