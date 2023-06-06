package oop;

class Test2{
	int n1;
	
	void up (int n3) {
		int n2 = 0;
		n1 += 1;
		n2 +=1;
		n3+=1;
		System.out.println("n1 : "+ n1);
		System.out.println("n2 : "+ n2);
		System.out.println("n3 : "+ n3);
		System.out.println();
	}
}

public class Ex04 {
	public static void main(String[] args) {
		Test2 ob = new Test2();
		ob.up(10);
		ob.up(20);
		ob.up(25);
		
		System.out.println("ob.n1 : " + ob.n1);
	}

}
