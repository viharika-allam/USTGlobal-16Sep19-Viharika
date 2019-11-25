package com.ustglobal.hasarelation.weak;

public class TestB {
	public static void main(String[] args) {
		Music m = new Music();
		System.out.println(m.song);
		System.out.println(m.volume);
		m.c.drive();
	}

}
