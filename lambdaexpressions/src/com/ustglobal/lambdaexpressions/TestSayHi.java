package com.ustglobal.lambdaexpressions;

public class TestSayHi {
	public static void main(String[] args) {
		SayHi si = ()->System.out.println("hi");
	
	si.sayHi();
	}

}
