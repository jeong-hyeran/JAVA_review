package thread;

class JobA extends Thread{
	@Override
	public void run() {
		for(char ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(ch+" ");
		}
	}
}

class JobB extends Thread{
	@Override
	public void run() {
		for(int i = 0; i <= 25; i++) {
			System.out.print(i+" ");
		}
	}
}

public class Ex01 {

	public static void main(String[] args) {
		
		JobA j = new JobA();
		JobB b = new JobB();
		
		j.run();
		b.run();
		System.out.println();
		
		j.start();
		b.start();
	}

}
