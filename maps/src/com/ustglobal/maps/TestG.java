package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestG {
	public static void main(String[] args) {
		Employee e1 = new Employee(1,"viha",5000);
		Employee e2 = new Employee(2,"sanju",10000);
		Employee e3 = new Employee(3,"arun",50000);
		Employee e4 = new Employee(4,"navi",55000);
		Employee e5 = new Employee(5,"hari",45000);
        Employee e6 = new Employee(6,"anu",58000);
        Employee e7 = new Employee(7,"snaha",35000);
        Employee e8 = new Employee(8,"anitha",57000);
        Employee e9 = new Employee(9,"samu",55000);
        Employee e10 = new Employee(10,"laki",75000);
        
        ArrayList<Employee> al1 = new ArrayList<Employee>();
        al1.add(e1);
        al1.add(e2);
        al1.add(e3);
        al1.add(e4);
        
        ArrayList<Employee> al2 = new ArrayList<Employee>();
        al2.add(e5);
        al2.add(e6);
        al2.add(e7);
        ArrayList<Employee> al3 = new ArrayList<Employee>();
        al1.add(e8);
        al1.add(e9);
        al1.add(e10);
        
        
        HashMap<String ,ArrayList<Employee>> hm = new HashMap<>();
	    hm.put("Manager1", al1);
	    hm.put("Manager2",al2);
	    hm.put("Manager3", al3);
	    
 ArrayList<Employee> first =hm.get("Manager1");
 ArrayList<Employee> second =hm.get("Manager2");
 ArrayList<Employee> third =hm.get("Manager3");
	    
	    Iterator<Employee> it =first.iterator();
	    while(it.hasNext()) {
	    	Employee e =it.next();
	    	System.out.println("Id is "+e.id);
	    	System.out.println("Name is "+e.name);
	    	System.out.println("salart is "+e.salary);
	    	System.out.println("====================");
	    }

        
	    
	}
}
