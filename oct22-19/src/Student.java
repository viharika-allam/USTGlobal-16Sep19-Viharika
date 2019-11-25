
public class Student {
	String name;
	int id;
	int mbno;
	String branch;
	String clgn;
	Student( String name, int id, int mbno, String branch, String clgn){
		this.name = name;
		this.id = id;
		this.mbno = mbno;
		this.branch = branch ;
		this.clgn = clgn ;
	}
	void printDetails() {
		System.out.println("Employee name is "+name);
		System.out.println("Employee id is "+id);
		System.out.println("Employee mbno is "+mbno);
		System.out.println("Employee branch is "+branch);
		System.out.println("Employee clgn is "+clgn);
	}
	public static void main(String[] args) {
		Student  s1 = new Student("viha" , 143 , 914521, "ece" ,"raghu");
		s1.printDetails();
		Student  s2 = new Student("manasa" , 144 , 773194, "cse" ,"bjykgy");
		s2.printDetails();
		Student  s3 = new Student("usha" , 145 , 775678, "ece" ,"vignan");
		s3.printDetails();
		Student  s4 = new Student("inna" , 146 , 757568, "agri" ,"gandi");
		s4.printDetails();
		Student  s5 = new Student("navven" , 147 , 914522, "ece" ,"raghu");
		s5.printDetails();

	}
		




}
