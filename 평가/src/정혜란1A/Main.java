package 정혜란1A;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Handler handler = new Handler();
		Member[] arr = null;
		Member tmp = null;
		int row = 0;
		String id;
		int menu;
		Scanner sc = new Scanner(System.in);
		String answer = "";

		// 더미 테스트
		handler.join(new Customer("itbank", "it", "테스트", "부산광역시 해운대구 우2동 센텀드림월드"));
		handler.join(new Customer("커스텀", "it", "뽀솜이", "부산광역시 해운대구 양산3"));
		handler.join(new Seller("판매녀", "it", "테스트2", "부산광역시 해운대구 우1동 메롱이"));
		handler.join(new Seller("판매남", "it", "테스트1", "부산광역시 해운대구 우5동 사랑이"));

		System.out.println("\t\t쇼핑몰 회원관리 프로그램 (응시자 : 정혜란 )");
		while (true) {
			System.out.println("1. 회원가입");
			System.out.println("2. 전체목록");
			System.out.println("3. 회원검색");
			System.out.println("4. 회원탈퇴");
			System.out.println("5. 회원목록(ID오름차순)");
			System.out.println("0. 종료");
			System.out.print("메뉴 선택 >>>");
			menu = Integer.parseInt(sc.nextLine());
			System.out.println();

			switch (menu) {
			case 1: // 회원가입
				System.out.print("1. 구매자 | 2.판매자 ");
				menu = Integer.parseInt(sc.nextLine());
				if (menu == 1)
					tmp = joinCustomer(sc);
				else if (menu == 2)
					tmp = joinSeller(sc);
				else {
					System.err.println("잘 못 선택 하셨습니다.");
					break;
				}
				row = handler.join(tmp);
				System.out.println();
				System.out.println(row != 0 ? "회원가입이 정상정으로 처리되었습니다." : "회원 가입 실패");
				System.out.println();
				break;

			case 2: // 전체목록
				arr = handler.showMember();
				for (Member memder : arr)
					if (memder != null) {
						System.out.println(memder);
					}
				break;

			case 3: // 회원 검색
				System.out.println("\t\tID로 회원을 검색합니다.");
				System.out.print("검색할 ID 입력 : ");
				id = sc.nextLine();
				System.out.println();

				arr = handler.search(id);
				if (arr == null) {
					System.out.printf("%s 회원을 찾을 수 없습니다.\n", id);
				} else {
					for (int i = 0; i < arr.length; i++) {
						Member mem = arr[i];
						if (mem != null) {
							System.out.println(mem);
						}
						System.out.println();
					}
				}

				break;

			case 4: // 회원탈퇴
				System.out.println("\t\t지정한 계정을 탈퇴합니다.");
				System.out.println("\t\tID로 회원을 검색합니다.\n");
				System.out.print("검색할 ID 입력 : ");
				id = sc.nextLine();
				System.out.println();
				arr = handler.search(id);
				if (arr != null) {
					System.out.print("정말 탙퇴 하시겠습니까? (y/n) : ");
					answer = sc.nextLine();
					if (answer.equals("y")) {
						row = handler.delete(id);
						System.out.printf("\t\t%s 계정이 탈퇴처리 되었습니다.\n", id);
					} else if (answer.equals("n")) {
						System.out.printf("\t\t%s 회원 탈퇴를 취소하였습니다.\n", id);
					} else {
						System.err.println("잘못 입력하였습니다.");
						break;
					}
				} else {
					System.err.println("회원 정보가 없습니다.");
				}

				break;

			case 5: // 회원정렬 (ID오름차순)
				arr = handler.sort();
				for (Member m : arr)
					if (m != null) {
						System.out.println(m);
					}
				break;

			case 0: // 종료
				sc.close();
				System.out.println("프로그램 종료");
				return;

			default:
				System.err.println("메뉴를 잘 못 선택 하셨습니다.");
				break;
			}// switch 종료

		} // while 종료
	}

	private static Member joinSeller(Scanner sc) {
		String id;
		String pw;
		String store;
		String name;
//		Member[] arr = new Member[100];

		System.out.print("ID를 입력하세요 : ");
		id = sc.nextLine();
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] != null && arr[i].id.equals(id)) {
//				System.err.println("중복 된 아이디입니다.");
//			}
//		}
		System.out.print("Pasword를 입력하세요 : ");
		pw = sc.nextLine();

		System.out.print("이름를 입력하세요 : ");
		name = sc.nextLine();

		System.out.print("가게이름를 입력하세요 : ");
		store = sc.nextLine();

		Seller seller = new Seller(id, pw, name, store);

		return seller;
	}

	private static Member joinCustomer(Scanner sc) {
		String id;
		String pw;
		String address;
		String name;

		System.out.print("ID를 입력하세요 : ");
		id = sc.nextLine();

		System.out.print("Pasword를 입력하세요 : ");
		pw = sc.nextLine();

		System.out.print("이름를 입력하세요 : ");
		name = sc.nextLine();

		System.out.print("배송주소를 입력하세요 : ");
		address = sc.nextLine();

		Customer customer = new Customer(id, pw, name, address);

		return customer;
	}
}