package thread;

import java.util.ArrayList;
import java.util.Scanner;

class Timer implements Runnable {
	@Override
	public void run() {
		for (int i = 10; i != -1; i--) {			//10부터 0까지 1씩 감소하면서
			System.out.printf("%02d : %02d\n", i / 10, i % 60);	// 시간 출력
			try {
				Thread.sleep(1000);		// 1초 기다리기
			}catch(InterruptedException e) {}
		}

	}

}
class StringInput implements Runnable{
	
	private Scanner sc = new Scanner(System.in);
	private ArrayList<String> list = new ArrayList<>();
	private Thread timer;
	
	public StringInput(Thread timer) {  // 객체 생성 시 타이머 스레드가 필요하다.
		this.timer = timer;
	}
	
	@Override
	public void run() {
		
		// Thread 클래스에는 isAlive() 메서드를 이용하여 스레드 동작여부를 판별할 수 있다.
		/// 타이머가 돌아가는 중에만 입력을 받겠다.
		
		while(timer.isAlive()) {		// 타이머 스레드가 동작중이라면 반복
										// 타이머 스레드가 종료되면 더 이상 입력 받지 않는다.
			System.out.print("입력 : ");		// 입력 프롬프트
			list.add(sc.nextLine());		// 입력받은 문자열을 리스트에 추가한다.
		}
		System.out.println("입력 끝, 출력시작");	// 반복이 끝나면
		list.forEach(s -> System.out.println(s));		// 리스트의 각 내용을 출력
//		list.forEach(System.out::println);		
		System.out.println();
	}
}
public class Ex03 {
	public static void main(String[] args) {
		
		Timer timer = new Timer();
		Thread th1 = new Thread(timer);
		
		StringInput input = new StringInput(th1);
		Thread th2 = new Thread(input);
		
		th1.start();		// 타이머 시작	
		th2.start();		// 타이머가 졸아가는 상황에서만 입력 받아서 리스트에 추가
		/// 트래드는 런의 내용을 따로따로 클래스를 만들어야 한다..?!
		
		
		
	}

}
