package com.ustglobal.collectionframwork.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(23);
		al.add(79.7);
		al.add(true);
		al.add("good morning");
		
		Iterator it = al.iterator();
		Object ol = it.next();
		System.out.println("obj1 "+ol);
		
		Object o2 = it.next();
		System.out.println("obj2 "+o2);
		
		Object o3 = it.next();
		System.out.println("obj3 "+o3);
		
		Object o4 = it.next();
		System.out.println("obj4 "+o4);
		
		boolean b = it.hasNext();
		System.out.println("has next"+b);
		
		//Object o5 = it.next();
		//System.out.println("obj5 "+o5);
		//nosuchelementexception
		
		System.out.println("++++++++++++");
		
		for(int i=0;i<al.size();i++) {
			Object o = al.get(i);
			System.out.println(o);
		}
		ArrayList al1 = new ArrayList();
		al1.add(12);
		al1.add(233.44);
		al1.add("momo");
		al1.add(false);
		
		System.out.println("_________________");
		Iterator it1 = al1.iterator();
		while(it1.hasNext()) {
		Object o = it1.next();
		System.out.println(o);
		}
		
		System.out.println("++++++++++++++");
		
		
	}

}
