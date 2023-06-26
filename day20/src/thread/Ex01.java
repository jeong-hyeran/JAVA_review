package thread;

class JobA extends Thread {
	// 1) thread 클래스를 상속받는다.
	// 2) public void run() 을 오버라이딩하여 내용을 작성한다.
	// 3) 객체를 생성한 후 start() 메서드를 호출하여 동시작업으로 수행한다.
	
	@Override
	public void run() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch + " ");
		}
	}
}

class JobB extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 25; i++) {
			System.out.print(i + " ");
		}
	}
}


public class Ex01 {
	public static void main(String[] args) {
		
		// Thread : 동시에 서로 다른 작업을 수행하기 위한 클래스
		
		JobA th1 = new JobA();
		JobB th2 = new JobB();
		
		/// 알파벳 나오고 숫자
		th1.run();		// 일반적인 메서드 호출을 진행하여
		th2.run();		// 다중 스레드로 작동하지 않는다.
		
		System.out.println();
		/// 알파벳과 숫자가 섞여 나온다.
		th1.start();	// run의 내용을 별도의 스레드를 생성하여
		th2.start();	// 해로운 스레드 내부에서 실행한다.
		/// thread로 start를 걸면 함수를 옆에 둬서 각각의 함수를 실행 할 수 있다.
		
	}

}
