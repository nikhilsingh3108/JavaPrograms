package com.test.stringmanipulation;

public class CompareTwoString {

	public static void main(String[] args) {
		String s1="Rohit Singh";
		String s2="Rohit Singh";
		
		if(s1.compareToIgnoreCase(s2)>0) {
			System.out.println("s1 is greater than s2");
		}
		else if (s1.compareToIgnoreCase(s2)<0) {
			System.out.println("s2 is greater than s1");
		}else
			System.out.println("s1 and s2 are equal");
		
	}

}
