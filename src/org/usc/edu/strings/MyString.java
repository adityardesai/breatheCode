package org.usc.edu.strings;

public class MyString {
	public static void main(String[] args) {
		String sample = "Hello World, How are you?";
		
		System.out.println("Sample String " + sample);
		System.out.println("lenght() " + sample.length());
		System.out.println("Lower Case " + sample.toLowerCase());
		System.out.println("Upper Case " + sample.toUpperCase());
		System.out.println("sample.isEmpty() " + sample.isEmpty());
		System.out.println("Index of , " + sample.indexOf(","));
		System.out.println("trim() " + sample.trim());
		System.out.println("sample.compareTo(Hello) " + sample.compareTo("Hello "));
		System.out.println("sample.concat(I am fine) " + sample.concat("I am fine "));
		System.out.println("sample.hashCode() " + sample.hashCode());
		System.out.println("Hello World, How are you.hashCode() " + "Hello World, How are you".hashCode());
		System.out.println("sample.chart(9) " + sample.charAt(9));
		System.out.println("index of > " + sample.indexOf('>'));
		System.out.println("indexOf(?) " + sample.indexOf("?"));
		System.out.println("sample.indexOf('e', 12) " + sample.indexOf('e', 12));
		System.out.println("sample.lastIndexOf(o) " + sample.lastIndexOf("o"));
		System.out.println("replace e by x " + sample.replace('e', 'x'));
		System.out.println("replaceAll ll by xx " + sample.replaceAll("ll", "xx"));
		System.out.println("replaceFirst " + "Hello World, How are you?".replaceFirst("He", "IT"));
		System.out.println("equals " + sample.equals("jI"));
		System.out.println("sample.intern " + sample.intern());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
