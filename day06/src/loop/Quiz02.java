package loop;


public class Quiz02 {
	public static void main(String[] args) {
		/*
		 은행에 돈을 입금한다.
		 첫날에는 10원, 둘째날에는 20원,셋째날에는 40원
		 이런식으로 전날의 두배를 준비하여 30일 동안 입금한다.
		 입금이 끝나면 은행에 예금된 총 금액은 얼마인지 계산하여 출력하세요
		 출력할 때 printf()의 서식을 활용하여 천단위 구분 콤마를 찍어주세요
		 */
		Long result=0L;
		Long money=10L;
		int i ;
//		int save=money*2;
		for (i = 1; i <= 30; i++) {//1날				2날		3날
			result+=money;		//result = 10		10+20=30  30+40=70
			money*=2;			//money = 10*2=20	20*2= 40
		}
		
		
		
		
		System.out.printf("%d일 예금된 총 금액은 %,d원입니다.",i,result);

	}

}
