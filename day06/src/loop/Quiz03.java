package loop;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		// 숫자를 입력 받아서 100의 자리수에 ","를 찍어라
		int n1=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("숫자 입력 : ");
	n1 = sc.nextInt();
		int cnt=0;
		String s1 = "";
		String s2 = "";
		
	while(n1 != 0) {
		if(cnt!=0&&cnt %3==0) {
			s1+=",";
		}
		cnt++;
		s1+=n1%10;
		n1/=10;
	}
	int i = s1.length()-1; 	
	while(i != -1) {
	s2+=s1.charAt(i);
	i--;
	}
	System.out.println(s2);
	
	
	
	sc.close();
	}
}
