package oop;

class kid {
	String name;
	double height;

	// 생성자
//	kid(String name, double height){
//		this.name = name;
//		this.height = height;
//	}

	void show() {
		System.out.printf("%s의 키는 %.1fcm입니다.\n", name, height);
	}

	void setData(String name, double height) {
		this.name = name;
		this.height = height;
	}
}

public class Ex02 {
	public static void main(String[] args) {
		kid o1 = new kid();
		kid o2 = new kid();
		kid o3 = new kid();
		kid o4 = new kid();
		kid o5 = new kid();

		o1.setData("짱구", 105.9);
		o2.setData("유리", 104.2);
		o3.setData("훈이", 106.2);
		o4.setData("맹구", 113.9);
		o5.setData("철수", 108.7);

		kid[] arr = { o1, o2, o3, o4, o5 };
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].show();
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].name.compareTo(arr[j].name) > 0) {
					kid tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i].show();
		}
		System.out.println();
	}

}
