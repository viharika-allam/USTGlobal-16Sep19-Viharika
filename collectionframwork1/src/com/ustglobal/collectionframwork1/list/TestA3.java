package com.ustglobal.collectionframwork1.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestA3 {
	public static void main(String[] args) {
		ArrayList<String> al =new ArrayList<String>();
		al.add("viha");
		al.add("swapna");
		al.add("ishu");
		al.add("rashmi");
		String s =al.get(2);
		System.out.println(s);
		
		System.out.println("____________");
		
		Iterator<String> it =al.iterator();
		while(it.hasNext()) {
			String sn =it.next();
			System.out.println(sn);
		}
	}

}
