package com.ustglobal.objectclass;

public class TestG {
public static void main(String[] args) {
		
		Empioyee e1 = new Empioyee(1,"ganga",10000);
		Empioyee e2 = new Empioyee(1,"viha",50000);
		Empioyee e3 = new Empioyee(1,"surya",10000);
		Empioyee e4 = e3;
		
		boolean isEqual = e1.equals(e2);
		System.out.println(e1.equals(e3));
		System.out.println(e3.equals(e4));
		System.out.println(isEqual);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
	}




}
