package com.ustglobal.thread.properties;

public class MyPriorityThread extends Thread {
	public static void main(String[] args) {
		System.out.println("Main started");
		int p = Thread.currentThread().getPriority();
		System.out.println("main thread priority "+p);
		
		Thread.currentThread().setPriority(7);
		System.out.println("main thread priority "+Thread.currentThread().getPriority());
		
		
		MyPriorityThread t = new MyPriorityThread();
		int q = t.getPriority();//this thread is crated with help of main thread i.e all child
		// will get priority is same as main thread
		System.out.println("mypriority thread priority "+q);
		
		t.setPriority(6);
		System.out.println("mypriority thread priority "+t.getPriority());
		
		System.out.println("main ended");
	}

}
