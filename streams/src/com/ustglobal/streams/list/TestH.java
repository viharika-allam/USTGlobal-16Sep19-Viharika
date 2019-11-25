package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;


public class TestH {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		Student s1 = new Student(101,"viha",45.55);
		Student s2= new Student(101,"viha",45.55);
		Student s4 = new Student(103,"navi",65.50);
		Student s3= new Student(102,"sam",55.55);
		Student s5 = new Student(103,"navi",65.50);
		
	
	Student s6 = new Student(103,"navi",65.50);
	al.add(s1);
	
	al.add(s2);
	al.add(s3);

	al.add(s4);
	al.add(s5);
	al.add(s6);
	Helper h =new Helper();
	//h.displayAllStudent(al);
	//h.displayFailedStudent(al);
	//h.displayTopperStudent(al);
	
	}
	Comparator<Student> cmp =(s1,s2)->{
		if(s1.percentage>s2.percentage) {
			return 1;
		}else if(s1.percentage<s2.percentage){
			return -1;
		}else {
			return 0;
		}
	};
	void displayTopperStudent(ArrayList<Student> al) {
		Student s =al.stream().max(cmp).get();
		System.out.println("Name is "+s.name);
		System.out.println("id is "+s.id);
		System.out.println("percentage is "+s.percentage);
		
	}
		
	
}
