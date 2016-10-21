package org.usc.edu.strings;

import java.util.HashMap;

public class AlphabetsComplete {

	public static void main(String[] args) {
		String set1[] = { "abcdefgh", "geeksforgeeks", "lmnopqrst", "abc" };
		String set2[] = { "ijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz", "defghijklmnopqrstuvwxyz" };
		AlphabetsComplete.complete(set1, set2);
	}

	private static void complete(String[] set1, String[] set2) {
		StringBuffer sb = new StringBuffer();
		int result = 0;
		for (String word1 : set1) {
			for (String word2 : set2) {
				sb.append(word1.concat(word2));
				result = check(sb.toString(), result);
			}
		}
		System.out.println(result);
	}

	private static int check(String string, int result) {

		int[] frequency = new int[26];
		int res = result;
		char[] myArray = string.toCharArray();
		for (int i = 0; i < myArray.length; i++) {
			int val = myArray[i] - 'a';
			frequency[val]++;
		}
		int k = 0;
		for (k = 0; k < frequency.length; k++) {
			if (frequency[k] < 0) {
				break;
			}
		}
		if (k == 26) {
			res++;
		}
		return res;
	}
	
}
