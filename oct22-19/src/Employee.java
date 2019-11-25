
public class Employee {
	String name;
	int eid;
	public Employee(String ename, int eeid) {
		name = ename;
		eid = eeid;
	}
	void printDetails() {
		System.out.println("Employee name is "+name);
		System.out.println("Employee id is "+eid);
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee("viha" , 143);
		e1.printDetails();
		Employee e2 = new Employee("inna" , 420);
		e2.printDetails();
		Employee e3 = new Employee("aruna", 69);
		e3.printDetails();
		
		
	}

}
