package com.test.stringmanipulation;

public class SwapVariable {

	public static void main(String[] args) {
		int a=10 ; int b=20;
		
		System.out.println("value of a is before swapping " + a);
		System.out.println("value of b is before swapping " +b);
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("value of a is After swapping " + a);
		System.out.println("value of b is After swapping " + b);
	}

}
