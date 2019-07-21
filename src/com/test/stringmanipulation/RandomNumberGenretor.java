package com.test.stringmanipulation;

import java.util.Random;

public class RandomNumberGenretor {

	public static void main(String[] args) {
			int max=100;
			int min=1;
			
			Random rn = new Random();
			int randomNumber = rn.nextInt((max-min)+1)+min;
			System.out.println(randomNumber);
			System.out.println(Math.random());
			
	}

}
