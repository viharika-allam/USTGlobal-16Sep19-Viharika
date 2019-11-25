package com.ustglobal.objectclass;

public class Empioyee {
	int id;
	String name;
	double salary;
	public Empioyee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		Empioyee e = (Empioyee) obj;
		if(this.id==e.id) {
			if(this.name.equals(e.name)) {
				if(this.salary==e.salary) {
					return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}else {
		return false;
	}
		
	

	}

	@Override
	public String toString() {
		return "Empioyee [id=" + id + ", name=" + name + ", salary=" + salary + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}