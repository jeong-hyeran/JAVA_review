package thread;

class JobC extends Object implements Runnable{
	@Override
	public void run() {
		for(char ch = 'a'; ch <= 'z' ; ch++) {
			System.out.print(ch + " ");
		}
	}
}
public class Ex02 {
	public static void main(String[] args) {
		JobC c = new JobC();
//		c.run();
		
		System.out.println();
		
		Thread th = new Thread(c);
		th.start();
		//// Thread가 동시에 실행된다는 건 알겠는뎅 말이지...
		//// 왜 반복문만 동시에 작업이 일어나지영?!
		//// 다른 출력물은.. 왜??? 작업시간이 적어서 한번만 출력 되니깐 순차적으로 진행된다!?
		/// start 뒤에 나오는 것들은 다아아아아아 섞여 나오나아아?
		
//		for (int i = 0; i < 25; i++) {
//			System.out.print(i + " ");
//		}
		for (int i = 0; i < 5; i++) {
			System.out.print(i + " 귀여워 ");
		}
	}

}

