package org.usc.edu;

public class Sum {

	public int[] twoSum(int[] nums, int target) {
		int nu[] = { 0, 0 };
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					nu[0] = i;
					nu[1] = j;
				}
			}
		}
		return nu;
	}

}
