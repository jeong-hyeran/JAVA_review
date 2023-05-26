package control;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		/*
		   사탕[ 1개에 500원]입니다.
		 [ 50개 이상] 구매하면 전체의 [8%]를 할인하고
		  [100개 이상] 구매하면 전체의 [12%]를 할인 합니다.
		  
		  [구매 수량]을 입력하여 [결제할 금액]을 계산하여 출력하세요
		 (단, 각각의 할인율은 중복해서 적용 할 수 없습니다.)
		 */
		Scanner sc = new Scanner(System.in);
		int candy = 500;
		int buy,cost;
		double dis;
		System.out.print("구매 수량 : ");
		buy = sc.nextInt();
		System.out.println();
		
		if(buy >= 100) {
			dis = 0.12;
		}else if(buy >=50) {
			dis = 0.08;
		}
		else {
			dis = 0;
		}
		cost = buy*candy;
		cost -= dis*cost; 
		System.out.printf("총 구매수량 : %d개\n할인율 : %.2f%%\n총 금액 : %,d원",buy,dis,cost);
		sc.close();
	}

}
