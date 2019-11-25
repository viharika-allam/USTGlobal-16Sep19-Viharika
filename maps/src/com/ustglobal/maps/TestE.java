package com.ustglobal.maps;

import java.util.Map;
import java.util.TreeMap;

public class TestE {
	public static void main(String[] args) {
		TreeMap<String,Integer> lh=new TreeMap<String,Integer>();
		
		lh.put("Hariyana", 134203);
		lh.put("Patna", 2445667);
		lh.put("Bangalore", 560068);
		//lh.put(null, 133457);
		
		for(Map.Entry<String, Integer> m:lh.entrySet()) {
			String Key =m.getKey();
			Integer Value =m.getValue();
			System.out.println("key is "+Key);
			System.out.println("value is "+Value);
			System.out.println("===============");
		}
		
	}

}
