package com.ustglobal.exception.first;

public class TestC {
	
	public static void main(String[] args) {
		System.out.println("main started");
		
		int a = 10;
		int b=0 ;
		try {
			b=10/2;
			System.out.println(b);
			System.out.println("hello");
			System.out.println("happy divali");
		}
		catch(ArithmeticException ae) {
			System.out.println("number is divided by zero");
		}
		System.out.println(b);
		System.out.println("main ended");
	}

}
