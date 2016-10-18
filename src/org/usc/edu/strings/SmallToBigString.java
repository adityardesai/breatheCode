package org.usc.edu.strings;

//Check if the all arr contributes to big
//https://www.careercup.com/question?id=5152821373566976

public class SmallToBigString {

	private static boolean check(String[] arr, String big) {
		int len = big.length();
		if (len <= 0 || big == "") {
			return Boolean.TRUE;
		} else {
			for (String word : arr) {
				if (big.startsWith(word)) {
					return check(arr, big.substring(word.length()));
				}
			}
			return Boolean.FALSE;
		}
	}

	public static void main(String[] args) {
		String big = "badactorgoodacting";
		String[] arr = { "bad", "actor", "good", "acting" };
		boolean check = check(arr, big);
		System.out.println(check);
	}

}
