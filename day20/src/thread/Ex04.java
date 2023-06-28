package thread;

import java.util.Scanner;

class Timer2 implements Runnable{
	private boolean over = false;
	private Question question;
	
	public boolean isOver() {
		return over;
	}

	public void setOver(boolean over) {
		this.over = over;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	@Override
	public void run() {
		try {Thread.sleep(500);}catch(Exception e ) {}
		for (int i = 5; i != -1 && question.isInputed()==false; i--) {
			System.out.printf("\n%02d : %02d\t", i/60, i%60);
			try {Thread.sleep(1000);}catch(Exception e ) {}
		}
		over = true;
	}
}

class Question implements Runnable{
	private boolean inputed = false;
	Scanner sc = new Scanner(System.in);
	private Timer2 timer;
	
	public boolean isInputed() {
		return inputed;
	}
	public void setInputed(boolean inputed) {
		this.inputed = inputed;
	}
	public Timer2 getTimer2() {
		return timer;
	}
	public void setTimer2(Timer2 timer) {
		this.timer = timer;
	}
	
	@Override
	public void run() {
		System.out.println("문제) 다음 중 출연 작품이 서로 다른 하나는?");
		System.out.println("1. 짱구");
		System.out.println("2. 유리");
		System.out.println("3. 철수");
		System.out.println("4. 코난");
		System.out.println("5. 훈이");
		System.out.print("입력 >>> ");
		int answer = sc.nextInt();
		inputed = true;
		if(answer == 4 && timer.isOver()==false) {
			System.out.print("정답");
		}else {
			System.out.println("오답");
		}
		
		sc.close();
	}
	
}

public class Ex04 {
	public static void main(String[] args) {
		Timer2 timer = new Timer2();
		Question question = new Question();
		
		Thread th1 = new Thread(timer);
		Thread th2 = new Thread(question);
		
		timer.setQuestion(question);
		question.setTimer2(timer);
		
		th1.start();
		th2.start();
		
	}
}
