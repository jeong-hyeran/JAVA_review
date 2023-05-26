package control;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		// 서로 다른 세 정수를 입력받아서 큰수를 출력하세요
		// 만약 같으면 아무 수나 출력해도 됩니다.
		
		Scanner sc = new Scanner(System.in);
		int n1,n2,n3,result;
		
		System.out.print("첫번쩨 정수 : ");
		n1 = sc.nextInt();
		System.out.print("두번쩨 정수 : ");
		n2 = sc.nextInt();
		System.out.print("세번쩨 정수 : ");
		n3 = sc.nextInt();
		result = n1;
		if(result<n2) {
			result = n2;
		}
		if(result<n3) {
			result = n3;
		}
		
		System.out.println("최대값 : " + result);
		
		sc.close();
	}
}
