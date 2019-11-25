package com.ustglobal.arrays;

public class TestA {
	public static void main(String[] args) {
		int[] nums = new int[5];
		nums[0]=10;
		nums[1]=20;
		nums[2]=30;
		nums[3]=40;
		nums[4]=50;
		for(int i=0 ; i<=nums.length; i++) {
			System.out.println(nums[i]);
		}
		System.out.println("+++++++++++++++");
		for(int num : nums) {
			System.out.println(num);
		}
		System.out.println("+++++++++++");
		char[] ch = {'a','b','c','d'};
		for(int i = 0;i<ch.length; i++) {
			System.out.println(ch[i]);
		}
		for(int c : ch) {
			System.out.println(c);
		}
		System.out.println("=============");
		boolean[] b = {true,false,true,false,true,true};
		System.out.println("+++++++++++++");
		byte[] b1 = {1,2,3,4,5};
		for(int i = 0; i<b1.length;i++) {
			System.out.println(b1[i]);
		}
		for(int d : b1) {
			System.out.println(d);
		}
		double[] b2 = {1.1,1.2,1.3,1.4,1.5};
		for(int d = 0;d<b2.length;d++) {
			System.out.println(b2[d]);
		}
		for(double e : b2) {
			System.out.println(e);
		}
		String[] names = {"viha","aishu","usha"};
		for(int i=0; i<names.length;i++) {
			System.out.println(names[i]);
		}
		System.out.println("------------------");
		for(String name :names) {
			System.out.println(name);
		}
	}

}
