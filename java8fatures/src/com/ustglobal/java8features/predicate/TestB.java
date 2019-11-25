package com.ustglobal.java8features.predicate;

import java.util.function.Predicate;

import com.ustglobal.java8features.Student;

public class TestB {
	public static void main(String[] args) {
		Predicate<Employee> p =e->{
			if(e.salary>=3500) {
				return true;
			}else {
				return false;
			}
		};
		
		Employee e = new Employee(1,"viha" ,650);
		boolean res= p.test(e);
		System.out.println(res);
	}
	}


