package org.usc.edu.strings;

//http://www.geeksforgeeks.org/compare-two-version-numbers/


public class Version {
	
	public static int compare(String one, String two){
		String[] oneArray = one.split("\\.");
		String[] twoArray = two.split("\\.");
		int i=0;
		while(i<3){
			if(Integer.parseInt(oneArray[i])<Integer.parseInt(twoArray[i])){return -1;}
			else if(Integer.parseInt(oneArray[i])>Integer.parseInt(twoArray[i])){return +1;}
			else i+=1;
				
		}
		return i;
			
	}
	
	public static void main(String[] args) {
		int res=Version.compare("1.0.31", "1.0.27");
		if(res>1){
			System.out.println("1.0.31 is bigger");
		}
		else
			System.out.println("1.0.27 is bigger");
	}
}
