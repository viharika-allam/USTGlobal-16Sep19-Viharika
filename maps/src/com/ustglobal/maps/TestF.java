package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestF {
	public static void main(String[] args) {
		Student s1 = new Student(2,"divya",67.89);
		Student s2 =new Student(3,"viha",70.0);
		Student s3 =new Student(4,"sam",73.0);
		Student s4 =new Student(5,"sanju",78.0);
		Student s5 =new Student(6,"madhu",75.0);
		Student s6 =new Student(7,"anu",68.0);
		Student s7 =new Student(8,"ravi",58.0);
		Student s8 =new Student(56,"santhu",48.0);
	    Student s9 =new Student(98,"haritha",60.0);
	    ArrayList<Student> al1 = new ArrayList<>();
	    al1.add(s1);
	    al1.add(s2);
	    al1.add(s3);
	    
	    ArrayList<Student> al2 = new ArrayList<Student>();
	    al2.add(s4);
	    al2.add(s5);
	    al2.add(s6);
	    
	    ArrayList<Student> al3 = new ArrayList<Student>();
	    al3.add(s7);
	    al3.add(s8);
	    al3.add(s9);
	    
	    HashMap<String ,ArrayList<Student>> hm = new HashMap<>();
	    hm.put("first", al1);
	    hm.put("second",al2);
	    hm.put("third", al3);
	    
	    ArrayList<Student> first =hm.get("second");
	    
	    Iterator<Student> it =first.iterator();
	    while(it.hasNext()) {
	    	Student s =it.next();
	    	System.out.println("Id is "+s.id);
	    	System.out.println("Name is "+s.name);
	    	System.out.println("percentage is "+s.percentage);
	    	System.out.println("====================");
	    }

	    
	}

}
