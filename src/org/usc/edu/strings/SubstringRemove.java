package org.usc.edu.strings;

/*
 * http://www.geeksforgeeks.org/check-string-can-become-empty-recursively-deleting-given-sub-string/
 * */
public class SubstringRemove {

	public static boolean removeSubstring(String mainString, String subString) {
		int lenTo = subString.length();// 5
		int len = mainString.length();

		while (len > 0) {
			int indexOf = mainString.indexOf(subString);
			if (indexOf == -1) {
				System.out.println("YES");
				break;
			}
			StringBuffer sb = new StringBuffer(mainString);
			sb.delete(indexOf, lenTo+indexOf);
			mainString = sb.toString();
			len = mainString.length();
		}
		return (mainString.length() == 0);
	}

	public static void main(String[] args) {

		System.out.println(removeSubstring("GEEGEEKSKS", "GEEKS"));
		System.out.println(removeSubstring("GEEGEEKSSGEK", "GEEKS"));

	}

}
