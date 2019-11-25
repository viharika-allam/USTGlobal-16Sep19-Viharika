package com.ustglobal.maps;

import java.util.Hashtable;

public class TestH {
	public static void main(String[] args) {
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		ht.put(500, "ajay");
		ht.put(102, "vijay");
		ht.put(600, "anu");
		ht.put(204, "monu");
		ht.put(601, "sri");
	//	ht.put(null, "john"); NullPointException
		//ht.put(108, null); NullPointException
		
		System.out.println("Data "+ht);
	}

}
