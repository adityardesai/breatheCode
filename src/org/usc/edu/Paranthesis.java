package org.usc.edu;


public class Paranthesis {
	public boolean isValid(String s) {
		Boolean res = Boolean.FALSE;
		if(s=="" || s.isEmpty()){
			res=Boolean.FALSE;
		}
		for (int i = 0; i < s.length() - 1; i++) {
			char c = s.charAt(i);
			char d = s.charAt(i + 1);
			if (c == '{' && d == '}')
				res= Boolean.TRUE;
			else if (c == '(' && d == ')')
				res= Boolean.TRUE;
			else if (c == '[' && d == ']')
				res= Boolean.TRUE;
			else
				res= Boolean.FALSE;
		}
		return res;
	}
}
