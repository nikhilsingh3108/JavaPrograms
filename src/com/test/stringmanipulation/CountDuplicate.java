package com.test.stringmanipulation;

import java.util.HashMap;

public class CountDuplicate {

	public static void main(String[] args) {
		int a[]= {45,67,23,45,23,78,99};
		
		HashMap<Integer, Integer> hm= new HashMap<>();
		
		for(Integer ab:a) {
			
			if (hm.containsKey(ab)) {
				
				hm.put(ab, hm.get(ab)+1);
				
			}
			else {
				hm.put(ab, 1);
			}
			
			
			
		}
		
		System.out.println(hm);
		
		System.out.println("just to chec git bahaviour");
		
		
		
		
		
	}

}
