package org.usc.edu.hash;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/*
 * 
 * Input :  arr[] = { 3, 1, 3, 2, 3, 2 }.
Output : 2
Frequency of 3 = 3.
Frequency of 2 = 2.
Frequency of 1 = 1.
Here difference of frequency of element 3 and 1 is = 3 - 1 = 2.
Also 3 > 1.
 * */

public class Frequency {

	public static void main(String[] args) {
		int myArray[] = { 3, 1, 3, 2, 3, 2 };
		Map<Integer, Integer> myHashMap = new HashMap();
		for (int i : myArray) {
			if (myHashMap.get(i) != null) {
				myHashMap.put(i, (int) myHashMap.get(i) + 1);
			} else {
				myHashMap.put(i, 1);
			}
		}
		ArrayList<Integer> arList = new ArrayList<Integer>();
		for (Map.Entry<Integer, Integer> map : myHashMap.entrySet()) {
			arList.add(map.getValue());
		}
		arList.sort(null);
		System.out.println(arList.get(arList.size()) - arList.get(0));
		
	}

}
