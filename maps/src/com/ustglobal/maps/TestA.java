package com.ustglobal.maps;

import java.util.HashMap;

public class TestA {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("kuku", 986688);
		hm.put("mala", 915421);
		hm.put("aruna", 987766);
		hm.put(null, 8345677);
		hm.put(null, 8340820);
		
		System.out.println("Data "+hm);
		hm.put("mala", 773194);
		System.out.println("After modify "+hm);
		hm.put("sanju", 986688);
		System.out.println("after modify value "+hm);
		System.out.println("afternull "+hm);
		System.out.println("after adding duplicate null "+hm);
		System.out.println("+++++++++++++++++++++++++++++++++++=");
		Object phoneno = hm.get("sanju");
		System.out.println("value "+phoneno);
		
		System.out.println("================");
		Object Phoneno1 =hm.get("sam");
		System.out.println("value "+Phoneno1);
		
		System.out.println("_________________________________");
		
		Object value = hm.remove("kuku");
		System.out.println(value);
		System.out.println(hm);
	}

}
