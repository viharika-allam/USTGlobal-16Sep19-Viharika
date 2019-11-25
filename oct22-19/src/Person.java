
public class Person {
	String name;
	int age;
	 Person (String pname, int page){
		 name = pname;
		 age = page;
	 }
	 void printDetails() {
			System.out.println("Person name is "+name);
			System.out.println("Person age is "+age);
		}
	 public static void main(String[] args) {
		Person p1 = new Person("haritha", 22);
		p1.printDetails();
		Person p2 = new Person("naveen", 22);
		p2.printDetails();

		Person p3 = new Person("chandini", 22);
		p3.printDetails();
	}

}
