package com.tashah.cs.search;

public class FirstBadVersion {

	public static int getFirstBadVersion (int[] versions) {
		if(versions.length == 0) {
			throw new RuntimeException();
		} else {
			int left = 0;
			int right = versions.length;
			while (left < right) {
				int mid = (left +right)/2;
				if(isBad(versions[mid])) {
					//go left.
					if(!isBad(versions[mid - 1])) {
						return versions[mid];
					} else {
						right = mid;
					}
				} else {
					// go right
					left = mid;
				}
			}
			return versions[left];
		}
		
	}
	public static void main(String[] args) {
		int[] versions = new int[] {1,3,5,6,7,8,30,9,77};
		System.out.println(getFirstBadVersion(versions));
	}
	
	private static boolean isBad (int version) {
		return version >= 70;
	}
}
