package com.ustglobal.maps;

import java.util.HashMap;

public class TestB {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("kuku", 986688);
		hm.put("mala", 915421);
		hm.put("aruna", 987766);
		
		HashMap hm1 = new HashMap();
		hm1.put("deepu", 786456);
		hm1.put("riya", 34567);
		hm1.put("kriti", 984666);
		
		boolean hasKey =hm.containsKey("mala");
		System.out.println("has key "+hasKey);
		boolean hasValue =hm.containsValue(6688);
		System.out.println("has value "+hasValue);
		
		hm.putAll(hm1);
		
		System.out.println("After put all "+hm);
		
		System.out.println(hm.size());
		
		boolean isEmpty = hm.isEmpty();
		System.out.println("Map is Empty "+isEmpty);
		
		hm.clear();
		System.out.println("After clear "+hm);
	}

}
