package org.usc.edu;

public class LengthLastWord {
	public int lengthOfLastWord(String s) {
		if (s.length() == 0 || s == null) {
			return 0;
		} else {
			String[] sample = s.split(" ");
			if (sample.length > 0) {
				String str = sample[sample.length - 1];
				return str.length();
			} else {
				return 0;
			}

		}

	}

}
