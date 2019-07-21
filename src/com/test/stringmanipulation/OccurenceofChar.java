package com.test.stringmanipulation;

public class OccurenceofChar {

	public static void main(String[] args) {
			String str="RohitSingh";
			int j=0;
			for(int i=0; i<str.length()-1;++i) {
				int count=0;
				for(j=0;j<=str.length()-1;++j) {
					if(str.charAt(i)==str.charAt(j)) {
						count++;
					}
				}
				System.out.println(str.charAt(j) + " present " + count +"times ");
			}
			
			
	}

}
