package org.usc.edu;

public class TwoSum {
	public int[] twoSum(int[] numbers, int target) {
		int first = 0;
		int last = numbers.length - 1;
		int[] res = { 0, 0 };
		if (numbers.length == 0 || numbers == null) {
			return null;
		}

		while (first < last) {
			int x = numbers[first] + numbers[last];
			if (x < target) {
				++first;
			} else if (x > target) {
				--last;
			} else {
				res[0] = first + 1;
				res[1] = last + 1;
				return res;
			}
		}
		return res;
	}
}