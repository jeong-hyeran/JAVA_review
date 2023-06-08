package abstracrClass;

abstract class MyButton{
	public void click() {
		this.onClick();
		
}

	protected abstract void onClick();
	
}

class TestButton extends MyButton{
	@Override
	protected void onClick() {
		System.out.println("test");
		System.out.println();
	}
}

class SquareButton extends MyButton	{
	private int size;
	public SquareButton(int size) {
		this.size = size;
	}
	@Override
	protected void onClick() {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.println("*  ");
			}
			System.out.println();
		}
	}
}
public class Ex02 {
	public static void main(String[] args) {
		TestButton btn1 = new TestButton();
//	btn1.click();

	SquareButton btn2 = new SquareButton(5);
//	btn2.click();

//	MyButton btn3 = new MyButton() { /// 익명 내부 클래스
//
//		private String url = "https://map.naver.com";
//		private String chromePath = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";

//		@Override
////		protected void onClick() throws Exception {
//			// 운영체제에게 명령을 전달 할 수있는 런 타임 가져오기
//			Runtime rt = Runtime.getRuntime();
//
//			// 문자열 형식의 명령어 준비
//			String cmd = String.format("%s %s", chromePath, url);
//
//			// 명령어를 실행하여 프로세스 받기
//			Process pro = rt.exec(cmd);
//
//			// 5초 동안 대기
//			Thread.sleep(5000);
//
//			// 실행된 프로세스를 강제로 종료
//			pro.destroyForcibly();
//
//		}
//	};
//	btn3.click();

	// 다형성에 의해서 각 서브클래스 객체는 슈퍼클래스 MyButton으로 받을 수 잇따.

	MyButton ob1 = btn1;
	MyButton ob2 = btn2;
	MyButton ob3 = btn3;

	MyButton[] arr = { ob1, ob2, ob3 };
	for (MyButton btn : arr) { 		// arr 내부의 각 btn에 대하여
		btn.click(); 				// btn 을 클릭했을 때의 결과를 호출한다.
	}
	
	// 추상클래스를 활용하여 객체를 구성하면
	// 서로 다른 클래스를 작성하고, 서로 다른 내용의 함수를 구성하면서고.
	// 일관된 방식으로 접근하여 처리할 수 있게 된다.
}

}
