package cafe;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Handler handler = new Handler();
		Cafe[] arr = null;
		Cafe tmp = null;
		int row;
		Scanner sc = new Scanner(System.in);
		int menu;
		String name;
		int price;
		String madeIn;
		String iceOrHot;
		
		//더미 데이터
		handler.add(new Coffee("아메리카노",2000,"에티오피아"));
		handler.add(new Coffee("카페모카",4000,"가나"));
		handler.add(new Coffee("카페라떼",2500,"에티오피아"));
		handler.add(new Tea("블랙티",3500,"ice"));
		handler.add(new Tea("루이보스티",5000,"hot"));
		
		
		while(true) {
		System.out.println("1. 전체 목록");
		System.out.println("2. 추가");
		System.out.println("3. 검색");
		System.out.println("4. 삭제");
		System.out.println("5. 정렬");
		System.out.println("0. 종료");
		System.out.print("선택 >>> ");
		menu = Integer.parseInt(sc.nextLine());
		System.out.println();
		
			switch(menu) {
			case 1: // 전체 목록
				arr = handler.showArr();
//				for (int i = 0; i < arr.length; i++) {
//					if(arr[i] != null) {
//						Cafe c = arr[i];
//						System.out.println(c);
//					}
//				}
				for(Cafe c : arr) 
					if(c != null) {
						System.out.println(c);
					}
				System.out.println();
				break;
				
			case 2 : // 추가
				System.out.println("추가할 메뉴를 선택하세요");
				System.out.print("1.coffee | 2.tea");
				menu = Integer.parseInt(sc.nextLine());
				if (menu == 1)	 		tmp = addCoffee(sc);
				else if (menu == 1) 	tmp = addTea(sc);
				
				row = handler.add(tmp);
				System.out.println(row != 0 ? "추가 성공" : "추가 실패");
				break;
				
			case 3 : // 검색(포함)
				System.out.print("검색할 상품이름 입력 : ");
				name = sc.nextLine();
				arr = handler.search(name);
				for(Cafe c : arr)
					if(c !=null) {
						System.out.println(c);
					}
				break;
				
			case 4 : // 삭제
				System.out.print("삭제할 상품이름 입력 : ");
				name = sc.nextLine();
				row = handler.delete(name);
				System.out.println(row != 0 ? "삭제 성공" : "삭제 실패");
				break;
				
			case 5 : // 정렬
				arr = handler.sort();
				for(Cafe c : arr)
//					if(c != null) {
						System.out.println(c);
//					}
				break;
				
			case 0 : // 종료
				System.out.println("프로그램 종료");
				return;
				
			}//switch 종료

		} //while문 종료
	}

	private static Cafe addTea(Scanner sc) {
		System.out.print("상품명 입력 : ");
		String name = sc.nextLine();
		
		System.out.print("가격 입력 : ");
		int price  = Integer.parseInt(sc.nextLine());
		
		System.out.print("온도 입력 : ");
		String iceOrHot = sc.nextLine();
		
		Tea tea = new Tea(name,price,iceOrHot);
		return tea;
	}

	private static Cafe addCoffee(Scanner sc) {
		
		System.out.print("상품명 입력 : ");
		String name = sc.nextLine();
		
		System.out.print("가격 입력 : ");
		int price  = Integer.parseInt(sc.nextLine());
		
		System.out.print("원산지 입력 : ");
		String madeIn = sc.nextLine();
		
		Coffee coffee = new Coffee(name,price,madeIn);
		return coffee;
	}



}
