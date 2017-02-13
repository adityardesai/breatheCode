package org.usc.edu.strings;

import java.util.HashMap;
import java.util.Map.Entry;

public class ValidString {

	public static Boolean checkValidity(String str) {
		StringBuffer sb = new StringBuffer(str);
		HashMap<Character, Integer> myMap = new HashMap<>();
		int count = 0;
		for (int i = 0; i < sb.length(); i++) {
			if (myMap.containsKey(sb.charAt(i)))
				myMap.put(sb.charAt(i), myMap.get(sb.charAt(i))+ 1);
			else {
				myMap.put(sb.charAt(i), 1);
			}
		}
		for (Entry<Character, Integer> check : myMap.entrySet()) {
			int v = check.getValue();
			if (v == 2) {
				count++;
			}
		}
		if (count == 1) {
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}
	}

	public static void main(String[] args) {
		System.out.println(checkValidity("abbca"));

	}
}
