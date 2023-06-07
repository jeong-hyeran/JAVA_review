package static_final;

class Test1{
	int n1 = 10;
	static int n2 = 20;
	
	void showN1() {
		System.out.println(n1);
	}
	
	static void showN2() {
		System.out.println(n2);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		System.out.println(Test1.n2);
		Test1 ob = new Test1();
		System.out.println(ob.n1);
	}

}
