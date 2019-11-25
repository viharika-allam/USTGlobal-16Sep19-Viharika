
public class Employee1 {
	String name;
	int eid;
	public Employee1(String name, int eid) {
		this.name = name;
		this.eid = eid;
	}
	void printDetails() {
		System.out.println("Employee name is "+name);
		System.out.println("Employee id is "+eid);
		this.sayHello();
	}
	void sayHello() {
		System.out.println("hello");
	}
	
	public static void main(String[] args) {
		Employee1 e1 = new Employee1("viha" , 143);
		e1.printDetails();
		Employee1 e2 = new Employee1("inna" , 420);
		e2.printDetails();
		Employee1 e3 = new Employee1("aruna", 69);
		e3.printDetails();
	}
		

}
