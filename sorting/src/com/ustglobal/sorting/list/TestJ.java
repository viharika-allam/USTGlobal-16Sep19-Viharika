package com.ustglobal.sorting.list;

import java.util.Iterator;
import java.util.TreeSet;

public class TestJ {
	public static void main(String[] args) {
		SortByName1  sn = new SortByName1();
		
	
	 TreeSet<Customer> ts = new TreeSet<Customer>(sn);
	 Customer c1 = new Customer("viha",68,678934);
	 Customer c2 = new Customer("sam",56,7897578);
	 Customer c3  = new Customer("ani",58,9876567);
	 Customer c4 = new Customer("navi",78,674399);
	 
	ts.add(c1);
	ts.add(c2);
	ts.add(c3);
	ts.add(c4);
	


	
	
	
	 
	 System.out.println("**********using iterator*********");
	 Iterator<Customer> it = ts.iterator();
		
		while(it.hasNext()) {
			Customer c  = it.next();
			System.out.println("name is "+c.name);
			System.out.println("id is "+c.id);
			System.out.println("salary is "+c.salary);
			System.out.println("________________");
		}
	}

}
