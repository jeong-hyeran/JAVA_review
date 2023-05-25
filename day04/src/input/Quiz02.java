package input;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		// 생년월일을 8자리 정수로 입력받아서
		// 올해연도를 이용하여 나이를 계산하여 출력하시
		// 출생 : yyyy-MM-dd
		// 나이 : x살
		
		int currentyear = 2023;
		int birthYear;
		int month;
		int date;
		int age, age2;
		int today;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("생년월일 입력[8자리] -> ");
		birthYear = Integer.parseInt(sc.nextLine());
		System.out.print("생일이 지났으면[1] 안지났으면 [2]입력 -> ");
		today  = Integer.parseInt(sc.nextLine());
		 
		
		date = birthYear % 100;	/// 일
		birthYear /= 100;			
		month = birthYear % 100;	/// 월	
		birthYear /= 100;			/// 년
		
		age = currentyear - birthYear+1;
		System.out.printf("출생 : %d-%2d-%2d\n생일 : %d살\n",birthYear,month,date,age);
		
//		if(today==1) {
//			age2 = age - 1}
//		else {age2 = age- 2}
//		
		
	}	
}
