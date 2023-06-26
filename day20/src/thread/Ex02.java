package thread;

// 내가 만드는 작업 클래스가 이미 다른 클래스를 상속받고 있다면?
// 자바는 크래스의 다중상속을 허용 하지 않는다.
// Runnable 인터페이스를 구현하여 내부 run을 오버라이딩 한다.

class JobC extends Object/*,Thread(이걸 허용 하지 않는다.*/ implements Runnable{
	
	@Override
	public void run() {
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(ch + " ");
		}
	}
	

}

public class Ex02 {
	// main 함수도 하나의 스레드 안에서 작동한다.
	public static void main(String[] args) {
		JobC ob = new JobC();
		
//		ob.run();	// run은 다중 스레드로써 작동하지 않는다.
//		ob.start(); //runnable은 start 메서드가 없다.
		
		Thread th = new Thread(ob);	// runnable을 생성자 매개변수에 전달
		th.start();					// runnable을 참조하는 thread의 start호출
		
		for (int i = 0; i < 25; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		/// run을 넣어주나 runnable를 상속받아하느냐의 차이..!?
		
	}

}
