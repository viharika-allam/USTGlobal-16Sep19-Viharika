package com.ustglobal.typecasting.reference;

public class TestS {
	public static void main(String[] args) {
		Pen p = new Marker();//Upcasting
		System.out.println(p.cost);
		p.write();
		//System.out.println(p.size); not possible
	//	p.color();                    not possible
		Marker m = (Marker)p;//Downcasting
		System.out.println(m.size);
		m.color();
		m.write();
	}

}
