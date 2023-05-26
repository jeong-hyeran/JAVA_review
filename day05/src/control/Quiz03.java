package control;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		// 서로 다른 두 정수를 입력받아서 큰수를 출력하세요
		// 만약 같으면 아무 수나 출력해도 됩니다
		Scanner sc = new Scanner(System.in);
		int n1, n2,result ;
		System.out.print("첫번째 정수를 입력하세요 : ");
		n1 = Integer.parseInt(sc.nextLine());
		System.out.print("두번째 정수를 입력하세요 : ");
		n2 = Integer.parseInt(sc.nextLine());
		
		if(n1> n2) {
			result = n1;
		}else {
			result = n2;
		}
		System.out.println(result);;
		sc.close();
	}

}
