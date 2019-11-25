package com.ustglobal.collectionframwork.list;

import java.util.ArrayList;
import java.util.Collections;

public class TestY {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("sam");
		al.add("viha");
		al.add("cani");
		al.add("kiran");
		
		System.out.println("before sort---------> "+ al);
		Collections.sort(al);
		System.out.println("after sort___________ "+al);
	}

}
