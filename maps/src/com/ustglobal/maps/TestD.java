package com.ustglobal.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestD {
	public static void main(String[] args) {
		LinkedHashMap<String,Integer> lh=new LinkedHashMap<String,Integer>();
		lh.put("Bangalore", 560068);
		lh.put("Hariyana", 134203);
		lh.put("Patna", 2445667);
		
		for(Map.Entry<String, Integer> m:lh.entrySet()) {
			String Key = m.getKey();
			Integer Value =m.getValue();
			System.out.println("key is "+Key+"----------"+"value "+Value);
			System.out.println("+++++++++++++++++++++");
		}
	}

}
