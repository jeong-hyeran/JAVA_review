package control;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		/*
		 * 지하철 1구간 당 평균 이동시간이 [4분]이라고 가정한다.
		 * [이동한 구간 수를 입력]받아서, [걸린시간]을 출력하세요
		 * 단, [시간이 60분 이상]이면 [시간과 분을 구분]하여 출력하고
		 * [시간이 60분 미만]이면 [분만 출력]하세요
		 */
		int time,sub,result;
		Scanner sc = new Scanner(System.in);
		time = 4;
		System.out.print("이동한 구간을 입력하세요 : ");
		sub = sc.nextInt();
		result = sub * time;
		if(result>=60) {
			int hour = result /60;
			int min = result % 60;
			System.out.printf("총 걸린시간은 %02d시간 %02d분 입니다.",hour,min);
		}else {
			System.out.printf("총 이동시간은 %02d분 입니다.",result);
		}
	
		sc.close();
	}

}
