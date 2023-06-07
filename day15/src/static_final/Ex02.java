package static_final;

class Guest{
	String name;
	static int count;
	
	Guest(String name){
		this.name = name;
		count+=1;
//		System.out.println(name+"입장!!");
//		System.out.println("현재까지 입장한 손님의 인원 수 : " + count);
//		이렇게도 할 수 있지만 함수는 같은 일을 하는 아이들로 구성하는것이 좋다!
	}
	
	void show() {
		System.out.println(name+"입장!!");
		System.out.println("현재까지 입장한 손님의 인원 수 : " + count);
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Guest ob1 =new Guest("이지은");
		ob1.show();
		
		Guest ob2 =new Guest("홍진호");
		ob2.show();
		
		System.out.println("현재까지 손님 수 : " + Guest.count);
		
		System.out.println(Integer.parseInt("1234")+1);
	}

}
