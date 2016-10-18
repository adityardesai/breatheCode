package org.usc.edu;

//https://www.careercup.com/question?id=5152821373566976

public class SmallToBigString {
	
	private static boolean check(String[] arr, String big) {
		int len = arr.length;
		int per = permutation(len);
		
		
		return Boolean.FALSE;
	
	}
	
	private static int permutation(int len) {
		if(len==0){
			return 0;
		}
		else
		{
			return permutation(len-1)*len;
		}
	}

	public static void main(String[] args) {
		String big = "badactorgoodacting";
		String[] arr = {"bad", "actor", "good", "acting"};
		boolean check = check(arr,big);
		System.out.println(check);
	}

}
