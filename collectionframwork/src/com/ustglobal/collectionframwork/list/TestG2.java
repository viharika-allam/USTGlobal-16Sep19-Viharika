package com.ustglobal.collectionframwork.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestG2 {
	public static void main(String[] args) {
		Vector li = new Vector();
		li.add(12);
		li.add(34.5);
		li.add("more");
		li.add(true);
		li.add(null);
		
		System.out.println("+======using for loop+++++++++++++");
		for(int i = 0; i<li.size();i++) {
			System.out.println(li.get(2));
		}
		System.out.println("_____________");
		for(Object object : li) {
			System.out.println(object);
		}
		System.out.println("++++++++++++using iterator++++++++++");
		Iterator it = li.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
		
		System.out.println("++++++++++==using list iterator+++++++++++++");
		ListIterator lt = li.listIterator();
		while(lt.hasNext()) {
			Object o =lt.next();
			System.out.println(o);
		}
		System.out.println("+++++++++++list iterator backword++++++++++++");
		while(lt.hasPrevious()) {
			Object o =lt.previous();
			System.out.println(o);
			
		}
	}

}
