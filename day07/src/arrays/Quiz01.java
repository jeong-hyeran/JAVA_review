package arrays;

import java.util.Arrays;
import java.util.Random;

public class Quiz01 {
	
	public static void main(String[] args) {
		
		Random ran = new Random();
		int size = 10;
		int range = 100;
		int[] arr = new int[size];
		
		for (int i = 0; i < arr.length; i++) {
				arr[i]=ran.nextInt(range);
		}
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		int even=0,odd=0;
		// 1) arr의 값에서 홀수와 짝수가 각각 몇개인지 파악하여 출력하세요
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				even++;
			}else {
				odd++;
			}
		}
		System.out.printf("even:%d odd:%d\n",even,odd);
		System.out.println();
		// 2) oddArray와 evenArray를 생성하여 각각 홀수와 짝수를 담아서 출력하세요
		int[]evenArray=new int[even];
		int[]oddArray=new int[odd];
		int j=0,k=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				evenArray[j]=arr[i];
				j++;
			}else {
				oddArray[k]=arr[i];
				k++;
			}
		}
		System.out.println(Arrays.toString(evenArray));
		System.out.println(Arrays.toString(oddArray));
		System.out.println();
		// 3) arr의 총합을 구하여 출력하세요
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
		System.out.println();
	}
}
