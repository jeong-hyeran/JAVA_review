package book;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Handler handler = new Handler();  //?? 왜 handler만?!불러올까..?
		
//		(String name,String writer,String date,double avg,int price)
		int menu;
		Book tmp = null;
		String keyword, name, writer, date;
		double avg;
		int price;
		Book[] arr = null;
		Book[] cart = null;
		int row;
		/// 더미 데이터(dummy date) 미리 테스트 하려면 미리 입력해놔도 된다.
		handler.add(new Book("변비 탐정 실록1","이나영","2023년05월30일",4.5,11700));
		handler.add(new Book("둥실이네 떡집","김리리","2022년04월22일",9.7,9900));
		handler.add(new Book("하하 자매 떡집","김리리","2023년05월22일",10.0,10800));
		
//		System.out.print("장바구님 담을 도서명 : ");
//		name = sc.nextLine();
////		row = handler.delete(name);
////		System.out.print(row!=0?"삭제 성공":"삭제 실패");
//		cart = handler.addCart(name);
//		System.out.println();
//		System.out.printf("cart list \n",Arrays.toString(cart));
		
		while(true) {
			System.out.println("1) 전체 목록");
			System.out.println("2) 추가");
			System.out.println("3) 삭제");
			System.out.println("4) 검색");
			System.out.println("5) 장바구니 담기");
			System.out.println("6) 장바구니 보기");
			System.out.println("0) 종료");
			System.out.println("선택 >>> ");
			menu = Integer.parseInt(sc.nextLine());
			System.out.println();
			
			switch(menu) {
			case 1 : // 전체 목록
				arr = handler.getArray();
				for (int i = 0; i < arr.length; i++) {
					if(arr[i]!=null) {
						arr[i].show();
					}
				}
				break;
			case 2 : // 추가
				System.out.print("독서명 : ");
				name = sc.nextLine();
				System.out.print("저자  : ");
				writer = sc.nextLine();
				System.out.print("출판일자 : ");
				date = sc.nextLine();
				System.out.print("평점: ");
				avg = Double.parseDouble(sc.nextLine());
				System.out.print("가격 : ");
				price = Integer.parseInt(sc.nextLine());
				
				tmp = new Book(name,writer,date,avg,price);
				row = handler.add(tmp);			// tmp값을 Handler클래스에 보내서 return값(row)을 받는다.
				System.out.print(row!=0?"추가 성공":"추가 실패");
				System.out.println();
				break;
				
			case 3 :  // 삭제	
				System.out.print("삭제 할 독서명 : ");
				name = sc.nextLine();
				row = handler.delete(name);
				System.out.print(row!=0?"삭제 성공":"삭제 실패");
				break;
				
			case 4: // 검색
				System.out.print("검색명 : ");
				keyword = sc.nextLine();
				arr = handler.search(keyword);
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] != null) {
						arr[i].show(); // 검색명이 포함되어있는 객체들을 다 보여준다.
					}
				}
				break;
				
			case 5: // 장바구니 담기
				System.out.print("담을 도서명 : ");
				keyword = sc.nextLine();
				cart = handler.addCart(keyword);
				for (int i = 0; i < cart.length; i++) {
					if (cart[i] != null) {
						cart[i].show(); // 검색명이 포함되어있는 객체들을 다 보여준다.
					}
//					tmp = new Book(cart);
				}
				break;
				
			case 6 : // 카트 목록
				cart = handler.getCart();
				for (int i = 0; i < 5; i++) {
					if(cart[i]!=null) {
						cart[i].show();
					}
				}
				break;
				
			case 0:
				System.out.println("프로그램 종료");
				sc.close();
				return;
			}// end of switch
			System.out.println();
		}// end of while
		
	}// end of main

}// end of class
