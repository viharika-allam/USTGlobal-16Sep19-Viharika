package com.ustglobal.java8features.predicate;

import java.util.function.Predicate;

public class TestA {
	public static void main(String[] args) {
		Predicate<Integer> p =i->{
			if(i>=8) {
				return true;
			}else {
				return false;
			}
		};
		
	boolean res =	p.test(11);
	System.out.println("Result "+res);
	
	
	}

}
