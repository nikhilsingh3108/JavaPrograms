package com.test.stringmanipulation;

public class StringOnlyDigit {

	public static void main(String[] args) {
		String str="325436";
		String str1="fdshgfj";
		
		System.out.println(str.matches(".*[0-9]"));
		System.out.println(str1.matches(".*[A-Za-z]"));
	}

}
