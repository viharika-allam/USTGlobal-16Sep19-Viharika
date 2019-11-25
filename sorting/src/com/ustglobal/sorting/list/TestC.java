package com.ustglobal.sorting.list;

import java.util.LinkedList;

public class TestC {
	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(12);
		l.add(23);
		l.add(34);
		l.add(45);
		
		
		Integer peekElement = l.peek();
		System.out.println("peek Element "+peekElement);
		Integer peekFirstElement = l.peekFirst();
		System.out.println("peek First Element "+peekFirstElement);
		Integer peekLastElement = l.peekLast();
		System.out.println("peek last element"+peekLastElement);
		System.out.println("after peek-----------> "+l);
		
		System.out.println("++++++++++++++++++++++++====");
		
		Integer pollElement = l.poll();
		System.out.println("poll Element "+pollElement);
		Integer pollFirstElement = l.pollFirst();
		System.out.println("poll First Element "+pollFirstElement);
		Integer pollLastElement = l.pollLast();
		System.out.println("poll last element"+pollLastElement);
		System.out.println("after poll-----------> "+l);
		
		l.push(12);
		System.out.println("After push------------> "+l);
		Integer p = l.pop();
		System.out.println(p);
		System.out.println("After pop--------> "+l);
		
		
		
	}

}
