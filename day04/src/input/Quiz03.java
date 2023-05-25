package input;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		// 클래스 자료형이 import되지 않아서 빨간줄이 생겼다면
		// 클래스 가장 오른쪽에 커서를 두고 자동완성 (ctrl + space)
		
		Scanner sc = new Scanner(System.in);
		
		// 이름(문자열), 나이(정수), 키(실수, cm), 몸무게(실수, kg)로 입력 받습니다.
		// 입력받은 값에서 체질량지수(BMI)를 구합니다.
		// BMI는 근육량, 유전적 원인, 개인적차이를 반영하지 못하는 단점이 있습니다.
		
		// BMI = 몸무게(kg) / 키(m)*키(m)(키^2)
		// ~18.5		저체중
		// 18.5 ~ 23	정상
		// 23 ~ 25		과체중
		// 25 ~			비만
		
		// 이름과 나이,BMI지수를 화면에 출력합니다.
		// 단, BMI지수는 소수점 이하 둘째자리까지 출력합니다.
		
		String name;
		int age;
		double weight,bmi,key,m_key;
		
		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.print("나이 : ");
		age = Integer.parseInt(sc.nextLine());
		System.out.print(" 키 : ");
		key = Double.parseDouble(sc.nextLine());
		System.out.print("체중 : ");
		weight = Double.parseDouble(sc.nextLine());
		System.out.println();
		
		m_key = key/100;
		bmi = weight/(m_key*m_key);
		
		System.out.printf("이름 : %s\n나이 : %d\n 키  : %.1f\n체중 : %.1f\nBMI : %.2f\n",name,age,key,weight,bmi);
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}
}	