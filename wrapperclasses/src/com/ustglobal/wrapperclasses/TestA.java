package com.ustglobal.wrapperclasses;

public class TestA {
	public static void main(String[] args) {
		int a = 10;
		System.out.println("a is "+a);
		Integer i = a; //boxing or auto boxing
		System.out.println("i is "+i);
		
		Integer x = 10;
		Integer z = new Integer(20);
		System.out.println("x is "+ x);
		int y = x;     //unboxing or auto unboxing
		System.out.println("y is"+ y);
		
		int value = Integer.parseInt("123");
		System.out.println("value is "+value);
		
		boolean result = Boolean.parseBoolean("true");
		System.out.println(" result is "+ value);
		
		int value1 = Integer.parseInt("445");
		System.out.println("value is "+value1);
		
	

	}

}
