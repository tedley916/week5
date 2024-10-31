
package com.weekly.week5;

import java.util.ArrayList;
import java.util.List;

public class Learn {

	public static void main (String[] args) {
		
		int num = 10;
		
		List<Integer> newList = new ArrayList<Integer>();
		
		for (int x = 1; x <= num; x++) {
			newList.add(x);
		}
		
		System.out.println ("1. " + newList.get(0));
		System.out.println ("2. " + newList.get(num-1));

	}
	
}
