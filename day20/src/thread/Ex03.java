package thread;

import java.util.ArrayList;
import java.util.Scanner;

class Timer implements Runnable{
	@Override
	public void run() {

		for (int i = 10; i != -1; i--) {
			System.out.printf("%02d : %02d\n", i/60,i%60);
			try {Thread.sleep(1000);}catch(InterruptedException e){}
		}
	}
}

class StringInput implements Runnable{
	
	private Scanner sc = new Scanner(System.in);
	private ArrayList<String> list = new ArrayList<>();
	private Thread timer;
	
	public StringInput(Thread timer) {
		this.timer = timer;
	}
	
	@Override
	public void run() {

		while(timer.isAlive()) {
			System.out.print("입력");
			list.add(sc.nextLine());
		}
		System.out.println("입력 끝, 출력 시작");
		list.forEach(System.out::print);
		
	}
	
	
}
public class Ex03 {
	public static void main(String[] args) {

		Timer timer = new Timer();
		Thread th1 = new Thread(timer);
		
		StringInput input = new StringInput(th1);
		Thread th2 = new Thread(input);
		
		th1.start();
		th2.start();
		
		
		System.out.println();
	}
}
