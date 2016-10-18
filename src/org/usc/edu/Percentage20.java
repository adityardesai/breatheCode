package org.usc.edu;

import java.net.URLDecoder;

public class Percentage20 {

	public static String removePercentage20(String str) {
		StringBuffer buffer = new StringBuffer();
		int i = 0;
		if (str == "") {
			return null;
		}
		while (i < str.length()) {
			char c = str.charAt(i);
			if (c != '%') {
				buffer.append(c);
				i++;
			} else if (c == '%') {
				i = i + 2;
			}
		}
		return buffer.toString();
	}

	public static void main(String[] args) {
		String given = "url%20encoding%20in%20java";
		given = Percentage20.removePercentage20(given);
		System.out.println(given.replaceAll("0", " "));
	}

}
