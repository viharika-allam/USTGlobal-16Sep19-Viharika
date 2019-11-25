package com.ustglobal.sorting.list;

import java.util.Comparator;
import java.util.Iterator;

public class SortByPincode implements Comparator<Bank> {
	@Override
	public int compare(Bank o1, Bank o2) {
		Integer i = o1.pincode;
		Integer j =o2.pincode;
		
	
		return (i).compareTo(j);
	}
		


}
