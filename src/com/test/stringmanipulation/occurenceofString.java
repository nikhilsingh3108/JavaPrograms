package com.test.stringmanipulation;

public class occurenceofString {

	public static void main(String[] args) {
		String s="k Hello Hi ,how are you";
		
		System.out.println(s.indexOf('H'));
		
		System.out.println(s.indexOf('H', s.indexOf('H')+1));
		
		System.out.println(s.indexOf('H',s.indexOf('H')+1)+1);
	}

}
