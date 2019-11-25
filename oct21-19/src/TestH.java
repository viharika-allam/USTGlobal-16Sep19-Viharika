
public class TestH {
	public static void main(String[] args) {
		FirstGen f = new FirstGen();
		f.msg();
		f.call();
		
		System.out.println("*************");
		SecoGen sc = new SecoGen();
		sc.msg();
		sc.call();
		sc.games();
		
		System.out.println("**************");
		ThirdGen th = new ThirdGen();
		th.msg();
		th.call();
		th.games();
		th.camera();
	}

}
