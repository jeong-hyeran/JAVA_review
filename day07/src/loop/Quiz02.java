package loop;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		
		// 사용자에게 1~100 사이의 정수를 입력받아서 
		// 전체 길이에서 입력한 수치 이전에는 #을 출력하고
		// 이후는 공백을 출력하다.
		// 단, 항상 가운데에는 입력한 수치를 % 형태로 출력해야한다.
		
		// [###########
		// if 50%
		Scanner	sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int n1,n2;
		n1 = sc.nextInt();
		System.out.print("[");
		n2=n1/2;
		for (int i = 0; i < 50; i++) {
			if(i<=n2) {
				System.out.print("#");
			}else {
				System.out.print(" ");
			}
			if(i==25) {
				System.out.printf(" %d%% ",n1);
			}
		}
		
		
		
		
		
//		System.out.print(s2);
		System.out.print("]");
		sc.close();
	}

}
