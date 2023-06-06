package oop;

class Test1{
	
	int n1 = 10;
	int n2;
	
	void showAdd() {
		System.out.printf("%d + %d = %d\n",n1,n2,n1+n2);
	}

	void showMultiple(int m) {
		System.out.printf("%d * %d = %d\n",n1,n2,n1*n2);
	}
	
	Test1(){
		System.out.println("객체를 생성하면 생성자가 호출된다.");
	}
}

public class Ex03 {
	public static void main(String[] args) {
		Test1 ob1 = new Test1();
		Test1 ob2 = new Test1();
		ob1.showAdd();
		ob2.showMultiple(2);
		
	}

}
