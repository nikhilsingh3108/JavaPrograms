package com.test.stringmanipulation;

public class LengthofcharWords {

	public static void main(String[] args) {
		String name="Rohit Singh Name is Rohit Singh Rohit";
		
		String[] name1 = name.trim().split("Roh");
		for(String names : name1) {
			System.out.println(names);
		}
		
		System.out.println(name1.length);
	}

}
