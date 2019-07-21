package com.test.stringmanipulation;

import java.util.Scanner;

public class MultiplyNumWithoutOperator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2=sc.nextInt();
		
		int Product=MultiplyNumWithoutOperator.Addition(num1, num2
				);
		System.out.println(Product);
	}
	public static int Addition(int num1,int num2) {
		int product=0;
		
		for(int i=0;i<num2;i++) {
			product=product+num1;
		}
		return product;
	}
	
}
