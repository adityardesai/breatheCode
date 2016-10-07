package org.usc.edu;

import java.util.HashMap;

public class Roman {
	
	public static int romanToInt(String s) {
        int result =0;
        HashMap<String,Integer> roman = new HashMap();
		roman.put("I",1);
		roman.put("V",5);
		roman.put("X",10);
		roman.put("L",50);
		roman.put("C",100);
		roman.put("D",500);
		roman.put("M",1000);
		
		
		for(int i=0;i<s.length();i++)
		{
		   char s2 = 0;
		   int val2;
		   char s1 = s.charAt(i);
		   int val1 = roman.get(String.valueOf(s1));
		   if(i+1<s.length())
		   {
			   s2 = s.charAt(i+1);
			   val2 = roman.get(String.valueOf(s2));
			   if(val1 >= val2){
				   result = result + val1;
			   }
			   else{
				   result = result +val2 - val1;
				   i++;
			   }
		   }
		   else
		   {
			   result = result + val1;
		   }
		}
        return result;
    }
	
	public static void main(String[] args) {
		
		System.out.println(Roman.romanToInt("MCMXCVI"));
	}

}
