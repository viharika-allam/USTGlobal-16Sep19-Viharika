package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {
	public static void main(String[] args) {
		LinkedHashSet<Double> ls = new LinkedHashSet();
		ls.add(23.3);
		ls.add(1.5);
		ls.add(67.5);
		ls.add(67.5);
		ls.add(34.8);
		System.out.println("*********8using for each***************");
		for(Object s :ls) {
			System.out.println(s);
		}
		System.out.println("**********using iterator*************");
		Iterator it =ls.iterator();
		while(it.hasNext()) {
			Object p = it.next();
			System.out.println(p);
		}
	}



}
