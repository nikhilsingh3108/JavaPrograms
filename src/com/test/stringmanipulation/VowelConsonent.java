package com.test.stringmanipulation;

public class VowelConsonent {

	public static void main(String[] args) {
		String str="Name";
		char[] ch = str.toCharArray();
		
		for(int i=0; i<=ch.length-1;i++) {
			if(ch[i] == 'A' || ch[i] =='B' || ch[i] == 'E' || ch[i] =='I' || ch[i] == 'O' || ch[i] =='U' || ch[i] == 'a' || ch[i] =='e' || ch[i] == 'i' || ch[i] =='o' || ch[i] == 'u' ) {
			System.out.println("character is vowel " + ch[i]);
			}
			else {
				System.out.println("character is consonent " + ch[i]);
			}
		}
	}

}
