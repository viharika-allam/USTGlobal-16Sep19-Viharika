package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Helper {
	void displayAllStudent(ArrayList<Student> al) {
		Iterator<Student> it =al.iterator();
		while(it.hasNext()) {
			Student s =it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage "+s.percentage);
		}
	}
	void displayFailedStudent(ArrayList<Student> al) {
		List<Student> l =
		al.stream().filter(student->student.percentage<40).collect(Collectors.toList());
		Iterator<Student> it =l.iterator();
		while(it.hasNext()) {
			Student s =it.next();
			System.out.println("Name is "+s.name);
			System.out.println("id is "+s.id);
			System.out.println("percentage is "+s.percentage);
			
		}
	}

}
