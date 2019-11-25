package com.ustglobal.objectclass;

public class TestE {
	
	public static void main(String[] args) {
		 
		Car c1 = new Car(50000,"benz","black");
		Car c2 = new Car(100000,"nano","white");
		Car c3 = new Car(70000,"toyato","red");
		int i = c1.hashCode();
		int j = c2.hashCode();
		int k = c3.hashCode();
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
	}

}
