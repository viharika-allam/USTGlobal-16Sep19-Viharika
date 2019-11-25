
public class TestC {
	public static void main(String[] args) {
		Person.color = "white";
		Person.sleep();
		System.out.println("person color"+Person.color);
		Person p1 = new Person();
		p1.age = 20;
		p1.name = "viha";
		System.out.println("person p1 age is"+p1.age);
		System.out.println("person p1 name is "+p1.name);
		p1.color = "black";
		p1.sleep();
		
		Person p2 = new Person();
		p2.age = 25;
		p2.name = "inna";
		System.out.println("person p2 age is"+p2.age);
		System.out.println("person p2 name is "+p2.name);
		
	}

}
