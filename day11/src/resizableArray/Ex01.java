package resizableArray;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// 크기가 변하는 배열

		Scanner sc = new Scanner(System.in);
		int size = 0;
		int[] arr = new int[size];
		int[] tmp;
		int input;

		while (true) {
			System.out.print("정수 입력 : ");
			input = sc.nextInt();
			if (input != 0) {
				size += 1;
				tmp = new int[size];
				for (int i = 0; i < tmp.length; i++) {
					tmp[i] = arr[i];
				}
				tmp[size - 1] = input;
			} else {
				break;
			}
			System.out.println(arr);
			System.out.println(arr.length + ":" + Arrays.toString(arr));
			System.out.println();
		}
		System.out.println(Arrays.toString(arr));
		sc.close();
	}

}
