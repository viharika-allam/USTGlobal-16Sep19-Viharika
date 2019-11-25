package com.ustglobal.lambdaexpressions;

public class TestSquare {
	public static void main(String[] args) {
		
		SquareInterface sqi = x->x*x;
		System.out.println(sqi.Square(6));
		
		
	}

}
