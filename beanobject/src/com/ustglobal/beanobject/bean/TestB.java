package com.ustglobal.beanobject.bean;

import java.util.Scanner;

public class TestB {
	public static void main(String[] args) {
		System.out.println("Scanner class");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		System.out.println("Age is"+age);
		String name = sc.next();
		System.out.println("Name is"+name);
		String para = sc.nextLine();
		System.out.println("Para is"+para);
		byte number = sc.nextByte();
		System.out.println("Number is"+number);
	}

}
