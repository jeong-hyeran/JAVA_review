package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;


public class Quiz02 {
	public static void main(String[] args) throws ParseException {
		// 서로 다른 두 기간을 날짜로 입력 받아서
		// 두 기간이 겹치는지 아닌지 판별하는 코드를 작성해봅시다.
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		
		System.out.print("기간 1 시작일 : ");
		Date period1Begin = sdf.parse(sc.nextLine());
		
		
		System.out.print("기간 1 종료일 : ");
		Date period1End = sdf.parse(sc.nextLine());
		
		System.out.print("기간 2 시작일 : ");
		Date period2Begin = sdf.parse(sc.nextLine());
		
		System.out.print("기간 2 종료일 : ");
		Date period2End = sdf.parse(sc.nextLine());
		System.out.println();
		
		for(Long i = period1Begin.getTime(); i<=period1End.getTime(); i+=1000*60*60*24) {
			String s = sdf.format(i);
			list1.add(s);
		}
		System.out.println(list1);			/// 1번 기간을 모두 리스트에 담는다.
		
		for(Long i = period2Begin.getTime(); i<=period2End.getTime(); i+=1000*60*60*24) {
			String s = sdf.format(i);
			list2.add(s);
		}
		System.out.println(list2);			/// 2번 기간을 모두 리스트에 담는다.
		System.out.println();
		
//		System.out.println(list1.retainAll(list2)? "겹침" : "겹치지 않음");
		/// list1과 list2를 비교해서 중복되는 값이 있으면 "겹침" 중복 값이 없으면 " 겹치지 않음" 출력
		/// 이거는 중복된 값을 추출하는 것이 아니라 list1의 값에서 중복된 값을 삭제하는 값이라 사용 불가
		// 우선은 boolean형 이 아니라 삼항연산자 사용 불가
		
		int i,j;
		int overlap=0;
		for (i = 0; i <= list1.size()-1; i++) {
			for (j = 0; j <= list2.size()-1; j++) {
				if(list1.get(i).contains(list2.get(j))) {
					overlap++;
//					System.out.printf("겹침 : list1 : %s\tlist2 : %s\n",list1.get(i),list2.get(j));
				}
			}
		}
		if(overlap!=0) {
			System.out.printf("두 기간에 겹치는 기간은 %d일 입니다.",overlap);
		}else {
			System.out.println("겹치는 기간이 없습니다.");
		}
		
		sc.close();
	}

}
