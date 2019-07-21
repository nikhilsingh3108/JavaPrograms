package com.test.stringmanipulation;

import java.util.HashSet;
import java.util.Set;

public class DuplicateString {

	public static void main(String[] args) {
		String[] name= {"Rohit" , "Sattu" , "Rishi" , "Rohit"};
		
		Set<String> set=new HashSet<>();
		for(String var:name) {
			if(set.add(var)==false) {
				System.out.println("Duplicate String is " + var);
			}
		}
		
		
	}

}
