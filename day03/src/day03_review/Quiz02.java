package day03_review;

import java.util.Scanner;

public class Quiz02 {	public static void main(String[] args) {
	
	long cardNumber;
	Scanner sc = new Scanner(System.in);
	String answer = "";
	long n1,n2,n3,n4;
	
	System.out.println("카드번호 16자리를 입력 : ");
	cardNumber = Long.parseLong(sc.nextLine());
	System.out.println("cardNumber : " + cardNumber);
	
	// 위 숫자를 4자리씩 분리하여 사이에 "-"를 더하여 다시 출력하세요
	// 나머지 연산을 사용하여 
	
	n4 = cardNumber % 10000;
	cardNumber /= 10000;
	n3 = cardNumber % 10000;
	cardNumber /= 10000;
	n2 = cardNumber % 10000;
	cardNumber /= 10000;
	n1 = cardNumber ;
	answer = n1 + " - " + n2 + " - " + n3 + " - " + n4;
	System.out.println(answer);
	
	sc.close();
	}
}
