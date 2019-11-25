package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestF {
	public static void main(String[] args) {
		
	
	ArrayList<Marker> al = new ArrayList<Marker>();
	
	al.add(new Marker(12,"black"));
	al.add( new Marker(2,"green"));
	al.add( new Marker(32,"red"));
	al.add(new Marker(5,"black"));
	
	
	
	System.out.println("before sorting___________");
	display(al);
	//SortByPrice sb = new SortByPrice();
	SortByColor sc = new SortByColor();
	//Collection.sort(al.sb);
	Collections.sort(al,sc);
	
	System.out.println("after sorting ");
	display(al);
	
}

static void display(ArrayList<Marker>al) {
Iterator<Marker> it = al.iterator();

while(it.hasNext()) {
	Marker m = it.next();
	System.out.println("price is "+m.price);
	System.out.println("color  is "+m.color);
	System.out.println("________________");
}
}

}
