package com.ustglobal.thread.properties;

public class MyThread extends Thread {
	public static void main(String[] args) {
		
		System.out.println("Main started");
		
		String tname = Thread.currentThread().getName();
		System.out.println("Current thread "+tname);
		
		MyThread t1 = new MyThread();//when we do this thread will be created but,
		//it will be started only if we call start() method
		String mname = t1.getName();
		System.out.println("MyThread name "+mname);
		
		Thread.currentThread().setName("Bala");
		
		t1.setName("Golu");
		System.out.println("MyThread name "+t1.getName());
		
		System.out.println(10/0);
		
		System.out.println("Main ended");
		
	}

}
