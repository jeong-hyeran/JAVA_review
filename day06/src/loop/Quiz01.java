package loop;


public class Quiz01 {
	public static void main(String[] args) {
		// 1부터 100사이의 정수를 반복하여
		// 홀수의 합과 짝수의 합을 각각 구하여 출력하세요
		
		int odd,even ;
		int oddsum=0,evensum=0 ;
		
		for (int i = 1; i <= 100; i++) {
			if(i %2 ==0) {
				even=i;
				evensum+=even;
			}else {
				odd=i;
				oddsum+=odd;
			}
		}
		System.out.printf("짝수의 합 : %d\n홀수의 합 : %d\n",evensum,oddsum);
		
		
		
		
		
	}

}
