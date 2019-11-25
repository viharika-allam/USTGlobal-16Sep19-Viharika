package com.ustglobal.collectionframwork1.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestA2 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(12);
		al.add("viha");
		al.add('v');
		al.add(23.6);
		al.add(true);
		al.add(null);
		al.add(12);
		al.add(null);
		al.add(12);
		 Object o =al.get(5);
		 System.out.println(o);
		 
		 System.out.println("++++++++++++++");
//		 Iterator it =al.iterator();
//		 while(it.hasNext()) {
//			Object obj= it.next();
//			System.out.println(obj);
//		 }
		 
		 ListIterator li =al.listIterator();
		 while(li.hasPrevious()) {
			 Object obj =li.previous();
			 System.out.println(obj);
		 }
	}

}
