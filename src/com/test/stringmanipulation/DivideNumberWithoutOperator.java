package com.test.stringmanipulation;

import java.util.Scanner;

public class DivideNumberWithoutOperator {

	public static void main(String[] args) {
		int result=0;
		
			Scanner sc= new Scanner(System.in);
			int num1 = sc.nextInt();
			int num2=sc.nextInt();
			
			int num3=num1+num2;
			
			while(num3>num2) {
				num3=num3-num2;
				result++;
			}
			System.out.println("Result is  "+result);
	}
	
		

}
