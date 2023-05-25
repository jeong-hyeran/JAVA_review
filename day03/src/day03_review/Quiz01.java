package day03_review;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1, s2;
		int age;
		boolean beforeBirht;
		
		System.out.print("나이를 정수로 입력하세요 : ");
		s1 = sc.nextLine();
		
		System.out.print("생일이 지났는지 true/false로 입력하세요 : ");
		s2 = sc.nextLine();
		
		// s1,s2를 형태에 맞게 변환하여 값을 담아주세요
		age = Integer.parseInt(s1); // String -> int
		beforeBirht = Boolean.parseBoolean(s2); // String -> boolean
		
		if(beforeBirht) {
			age -= 1 ;
		}else{
			age-= 2;
		}
		
		System.out.println(age);
		System.out.println(beforeBirht);

	
	
	
		sc.close();
	}
}
