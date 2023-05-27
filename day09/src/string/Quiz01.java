package string;

import java.util.Scanner;

public class Quiz01 {
public static void main(String[] args) {
		
		// Luhn 알고리즘
		
		/*
 			카드번호 16자리의 글자를 이용하여 카드번호의 유효성을 검증하는 알고리즘
 			우측부터 세어서 홀수번째는 그대로 두고 짝수 번째는 두배로 만든다.
 			만약 두배로 만들어진 값이 두자리수가 되면 각 자릿수를 합한다.
 			이렇게 만들어진 16자리의 정수를 모두 더하여 그 합이
 			10으로 나누어 떨어지면 유효한 카드번호, 그렇지 않으면 유효하지 않은 카드번호이다.
 			
 			문자열로 카드번호를 xxxx-xxxx-xxxx-xxxx 형식으로 전달받아서
 			유효성을 true/false로 반환하는 함수를 작성하고 테스트하세요
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("카드번호 입력 : ");
		String card = sc.nextLine();
		
		cardCheck(card);
//		boolean result;
//		String cardNumber;
//		cardNumber=card.replace("-","");
//		System.out.print("카드번호 : "+cardNumber);
//		System.out.println();
//		String[] card_1=new String[16];
//		int[] card_2=new int[16];
//		for (int i = 0; i < cardNumber.length(); i++) {
//			card_1[i]=cardNumber.substring(i,i+1);
//		}
//		System.out.print("카드 인덱스: "+Arrays.toString(card_1));
//		System.out.println();
//		for (int i = 0; i < card_1.length; i++) {
//				card_2[i]=Integer.parseInt(card_1[i]);
//		}
//		for (int j = 0; j < card_2.length; j++) {
//			if(j==0||j%2==0) {
//				card_2[j]*=2;
//			}
//			if(card_2[j]>=10) {
//				card_2[j]-=9;
//			}
//		}
//		System.out.print("카드2인덱스: "+Arrays.toString(card_2));
//		System.out.println();
//		int sum=0;
//		for (int i = 0; i < card_2.length; i++) {
//			sum+=card_2[i];
//		}
//		System.out.print("숫자의 합: "+sum);
//		System.out.println();
//		
//		if(sum % 10 == 0) {
//			result=true;
//		}else {
//		result=false;
//		}
//		System.out.print("유효성 검사 : "+result);
//		System.out.println();
//	
	
	
	sc.close();
	
}

 static boolean cardCheck(String card) {
	 	boolean result;
		String cardNumber;
		cardNumber=card.replace("-","");
		String[] card_1=new String[16];
		int[] card_2=new int[16];
		for (int i = 0; i < cardNumber.length(); i++) {
			card_1[i]=cardNumber.substring(i,i+1);
		}
		for (int i = 0; i < card_1.length; i++) {
				card_2[i]=Integer.parseInt(card_1[i]);
		}
		for (int j = 0; j < card_2.length; j++) {
			if(j==0||j%2==0) {
				card_2[j]*=2;
			}
			if(card_2[j]>=10) {
				card_2[j]-=9;
			}
		}
		int sum=0;
		for (int i = 0; i < card_2.length; i++) {
			sum+=card_2[i];
		}
		
		if(sum % 10 == 0) {
			result=true;
			System.out.print("유효한 카드입니다.");
		}else {
		result=false;
		System.out.print("유효하지 않은 카드입니다.");
		}
		return result;
	
}
}
