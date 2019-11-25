package com.ustglobal.lambdaexpressions;

public class TestFact {
	public static void main(String[] args) {
		FactInterface fi = (n)->{
			int fact = 1;
			for(int i = 2;i<=n;i++) {
				fact = fact*i;
			}
			return fact;
		};
		int factTotal = fi.fact(5);
		System.out.println("factorial is"+factTotal);
	}

}
