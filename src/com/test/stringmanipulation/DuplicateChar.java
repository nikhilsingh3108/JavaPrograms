package com.test.stringmanipulation;

import java.util.HashSet;
import java.util.Set;

public class DuplicateChar {

	public static void main(String[] args) {
		String str="abcde faghcdije";
		char ch=0,ch1;
		int count=0;
//		for(int i=0;i<=str.length()-1;i++) {
//			for(int j=i+1; j<=str.length()-1;j++) {
//				ch =str.charAt(i);
//				ch1=str.charAt(j);
//				if(ch==ch1) {
//					count++;
//				}
//			}
//			if(count>0) {
//				System.out.println("char is duplicate" + ch);
//			}
			
	//	}
		
		char[] chr = str.toCharArray();
		Set<Character> set = new HashSet<Character>();
		for(Character chr1:chr)
		if(set.add(chr1)==false) {
			System.out.println("Duplicate char is " + chr1);
		}
		
		
		
		
		
		}
		
		
		
	}

