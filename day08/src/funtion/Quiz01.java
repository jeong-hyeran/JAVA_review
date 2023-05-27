package funtion;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int[] arr = new int[3];
		int[] arr2 = new int[3];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(15)+1;
		}
		
		System.out.println("엘베 있는 층"+Arrays.toString(arr));
		// 3대의 엘리베이터가 있다.
		// 사용자에게 현재 층수를 입력 받아서 가장 가까운 엘리베이터가 움직이도록 출력하세요
		// 처음부터 순서대로, 엘레베이터의 이름은 A,B,C라고 하면
		// "%s 엘리베이터가 이동합니다."라고 출력해야합니다.
		// Ex04에서 작성했던 함수를 참조하여, 활용하면 좋습니다.
		
		int floor=5;
//		System.out.print("현재 층 : ");
//		floor = sc.nextInt();
				
		for (int i = 0; i < arr.length; i++) {
			arr2[i]=arr[i]-floor;
			if(arr2[i]<0)
				arr2[i]*=-1;
		}		
		System.out.println("차이나는 층수"+Arrays.toString(arr2));
		int cnt=0;
		int min = 14;
		for (int i = 0; i < arr2.length; i++) {
			min=arr2[i];
			if(arr2[i]>arr2[i+1]) {
			min=arr2[i+1];	
			}
			cnt++;
		}
		System.out.print(cnt);
		
		sc.close();
		
	}

}
