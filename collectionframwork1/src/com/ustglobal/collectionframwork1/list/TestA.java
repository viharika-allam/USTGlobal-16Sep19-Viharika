package com.ustglobal.collectionframwork1.list;

import java.util.ArrayList;

public class TestA {
	public static void main(String[] args) {
		
	
	ArrayList al = new ArrayList();
	al.add(12);
	al.add(23.5);
	al.add(null);
	al.add("viha");
	al.add('v');
	al.add(null);
	al.add(null);
	al.add(12);
	Object o =al.get(2);
	System.out.println(o);
	System.out.println("____________");
	for(int i=0 ; i<8; i++) {
		Object obj  =al.get(i);
		System.out.println(i);
		System.out.println("+++++++++++++++++++++");
		for(Object obj1 :al) {
			System.out.println(obj1);
		}
		
	}
	
	
	}
}
