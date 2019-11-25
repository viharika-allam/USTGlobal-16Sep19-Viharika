package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestE {
	public static void main(String[] args) {
ArrayList<Pen> al = new ArrayList<Pen>();
		
		Pen p1 = new Pen(12,"sello","black");
		Pen p2 = new Pen(2,"boll","green");
		Pen  p3 = new Pen(32,"bright","red");
		Pen p4 = new Pen(5,"Fast","black");
		
		
		
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		System.out.println("before sorting___________");
		displayPenDetails(al);
		Collections.sort(al);
		System.out.println("after sorting--------");
		displayPenDetails(al);
	}

static void displayPenDetails(ArrayList<Pen>al) {
	Iterator<Pen> it = al.iterator();
	
	while(it.hasNext()) {
		Pen p = it.next();
		System.out.println("price is "+p.price);
		System.out.println("brand is "+p.brand);
		System.out.println("color  is "+p.color);
		System.out.println("________________");
	}
	
		
		
	}

}
