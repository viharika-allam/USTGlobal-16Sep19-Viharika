package com.ustglobal.collectionframwork.list;

import java.util.ArrayList;

public class TestE {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("viha");
		
		Object o = al.get(0);
		System.out.println(o);
	String name  = (String) o;
	
		name = name.toUpperCase();
		System.out.println(name);
	}

}
