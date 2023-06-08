package abstracrClass;

class Normal{
	public void test1() {
		System.out.println("test1");
	}
}

abstract class Abstract{
	public void test2() {
		System.out.println("test2");
	}
	
	// 함수내용이 들어가는 {}를 사용 할 수 없고, 세미콜론(;)으로 마무리 해야한다.
	public abstract void test3();
}

class Sub extends Abstract{
	@Override
	public void test3() {
		System.out.println("test3");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Normal ob1 = new Normal();
		ob1.test1();
		
//		Abstract ob2 = new Abstract();
//		ob2.test1();
		
		Sub ob3 = new Sub();
		ob3.test2();
		ob3.test3();
		
		Abstract ob4 = new Sub();
		ob4.test3();
		ob4.test2();
		
		Abstract ob5 = new Abstract() {
			@Override
			public void test3() {
				System.out.println("즉석에서 작성한 test3");
			}
		};
		ob5.test3();
	}

}
