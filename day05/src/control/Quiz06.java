package control;

import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {
		
		/*놀이기구 이용시간에 따른 요금을 계산하여 출력하세요
		[기본 요금은 3,000원]이며 [10분당 500원]의 요금이 추가로 발생합니다.
		기본 요금이 적용되는 구간은 0 ~30분 입니다.
		시간			금액
		 0 ~ 30		3,000원
		31 ~ 40		3,500원
		41 ~ 50		4,000원
		51 ~ 60		4,500원
		이후 시간대에서도 동일한 규칙으로 적용되어야 합니다.
		/// 구간에 따라 늘어나는..곱하기로 하면 안된다.
		추가요금이 발생하는 경우와 발생 안하는 경우를 봐야한다.
		구간에 따라서 얼마만큼 늘어나는가.
		*/
		
		Scanner sc = new Scanner(System.in);
	
		int basic=3000;
		int time,extra,cost;
		System.out.print("이용 시간을 입력하세요 : ");
		time = sc.nextInt();
		time -= 30;
		if (time >0) {
			if(time % 10 ==0)
			cost=time
		}
		
		sc.close();
	}

}
