package com.test.stringmanipulation;

import java.util.HashMap;

public class FirstNonRepeatedString {

	public static void main(String[] args) {
		String str= "RohitSingh";
		char[] chr = str.toCharArray();
	int count=0;	
		HashMap<Character, Integer> map=new HashMap<>();
		
		for(int i=0; i<chr.length;i++) {
			if(!map.containsKey(chr[i])) {
				map.put(chr[i], 1);
				count=1;
			}else {
				count=count+1;
				map.put(chr[i], count);
			}
		}
		System.out.println(map);
		
		for(int i=0;i<=chr.length;i++) {
			if(map.get(chr[i])==1) {
				System.out.println("Non duplicate element is " + chr[i]);
				break;
				
			}
		}
		
		
	}

}
