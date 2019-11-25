package com.ustglobal.sorting.list;

import java.util.Iterator;
import java.util.TreeSet;

public class TestI {
	public static void main(String[] args) {
		//SortByName sb = new SortByName();
		//SortByPincode  sp = new SortByPincode();
		SortByMicr  sm = new SortByMicr();
		 TreeSet<Bank> ts = new TreeSet<Bank>(sm);
		 Bank b1 = new Bank("HDFC",560068,678934);
		 Bank b2 = new Bank("SBI",5678900,7897578);
		 Bank b3 = new Bank("CITI",589467,9876567);
		 Bank b4 = new Bank("CANARA",560078,674399);
		 
		 ts.add(b1);
		 ts.add(b2);
		 ts.add(b3);
		 ts.add(b4);
		 
		 System.out.println("**********using iterator*********");
		 Iterator<Bank> it = ts.iterator();
			
			while(it.hasNext()) {
				Bank b  = it.next();
				System.out.println("name is "+b.name);
				System.out.println("pincode is "+b.pincode);
				System.out.println("MICR is "+b.micr);
				System.out.println("________________");
		}

		 
	}

}
