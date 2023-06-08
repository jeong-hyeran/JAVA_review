package daiso;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Handler handler = new Handler();
		Daiso[] arr = null;
		Daiso tmp = null;
		int row;
		int menu;
		Scanner sc = new Scanner(System.in);
		String name;
		int price;
		String expirationDate;
		int ageOfUse;
		
		// 더미 데이터 추가
		handler.add(new Toy("기차",5000,6));
		handler.add(new Toy("자동차",2000,8));
		handler.add(new Toy("인형",3000,3));
		handler.add(new Snack("과자",1500,"2023-09-25"));
		handler.add(new Snack("사탕",1000,"2023-09-25"));
		
		while(true) {
			System.out.println("1. 전체목록");
			System.out.println("2. 추가");
			System.out.println("3. 검색");
			System.out.println("4. 삭제");
			System.out.println("5. 정렬");
			System.out.println("0. 종료");
			System.out.print("선택>>> ");
			menu=Integer.parseInt(sc.nextLine());
			System.out.println();
			
			switch (menu) {
			case 1:  // 전체목록
				arr=handler.showArr();
				for(Daiso d:arr)
					if(d!=null) {
						System.out.println(d);
					}
				break;
				
			case 2: // 추가
				System.out.println("상품유형을 선택하세요");
				System.out.println("1.장난감 | 2.간식");
				int num =Integer.parseInt(sc.nextLine());
				if(num ==1 ) 		tmp = toyAdd(sc);
				else if(num == 2)	tmp = snackAdd(sc);
				else 				tmp = null;
				row = handler.add(tmp);
				System.out.print(row != 0 ? "추가 성공" : "추가 실패");
				
				break;
				
			case 3: // 검색(포함)
				System.out.print("상품명을 입력하세요 : ");
				name = sc.nextLine();
				arr = handler.search(name);
				for(Daiso d : arr)
					if(d != null) System.out.println(d);
				break;
				
			case 4: // 삭제(전체이름)
				System.out.print("삭제할 상품명을 입력하세요 : ");
				name = sc.nextLine();
				row = handler.delete(name);
				System.out.println("삭제 개수"+row);
				System.out.println(row!=0?"삭제 성공":"삭제 실패");
				break;
				
			case 5: // 정렬
				System.out.println("정렬방식을 선택하세요");
				System.out.print("1. 상품명순 | 2. 가격순 >> ");
				num =Integer.parseInt(sc.nextLine());
				System.out.println();
				if(num != 1 && num!=2) {
					System.err.println("잘못입력되었습니다.");
				}
				
				arr = handler.sort(num);
				for (int i = 0; i < arr.length; i++) {
					if(arr[i]!=null) {
						System.out.println(arr[i]);
					}
				}
				break;
				
			case 0: //종료
				sc.close();
				System.out.println("프로그램 종료");
				return;
				
			default:
				System.err.println("메뉴를 잘못 선택하셨습니다.");
			}
			System.out.println();
		}

	}

	private static Daiso snackAdd(Scanner sc) {
		String name;
		int price;
		String expirationDate;
		
		System.out.print("상품명 입력 : ");
		name = sc.nextLine();
		
		System.out.print("가격 입력 : ");
		price = Integer.parseInt(sc.nextLine());
		
		System.out.print("유효기간 입력(yyyy-MM-dd) : ");
		expirationDate = sc.nextLine();
		
		Snack snack = new Snack(name, price, expirationDate);
		return snack;
	}

	private static Daiso toyAdd(Scanner sc) {
		String name;
		int price;
		int ageOfUse;
		
		System.out.print("상품명 입력 : ");
		name = sc.nextLine();
		
		System.out.print("가격 입력 : ");
		price = Integer.parseInt(sc.nextLine());
		
		System.out.print("사용연령 입력 : ");
		ageOfUse = Integer.parseInt(sc.nextLine());
		
		Toy toy = new Toy(name, price, ageOfUse);
		return toy;
	}

}
