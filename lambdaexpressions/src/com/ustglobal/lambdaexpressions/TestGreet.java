package com.ustglobal.lambdaexpressions;

public class TestGreet {
	public static void main(String[] args) {
		GreetInterface gt = (message)->{
			System.out.println("hello");
			System.out.println(message);
		};
		gt.greet("aaaa");
	}

}
