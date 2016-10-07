package org.usc.edu;

public class Palindrome {

	public static boolean isPalindrome(int x) {
		int num = x;
		if (x < 0) {
			return false;
		}
		if (x < 10)
			return true;

		int a;
		int res = 0;
		while (x > 0) {
			a = x % 10;
			x = x / 10;
			res = res * 10 + a;
		}
		if (res == num)
			return true;
		else
			return false;

	}

	public static void isPalindrome(int x, boolean flag) {
		int num = x;
	}

	public static void main(String[] args) {
		System.out.println(Palindrome.isPalindrome(11));
	}

}
