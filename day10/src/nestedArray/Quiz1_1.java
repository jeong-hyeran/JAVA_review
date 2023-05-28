package nestedArray;

public class Quiz1_1 {
	static void show(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int size = 5;
		int num = 1;
		int[][] arr = new int[size][size];
//		int sign = -1;
		int line = 0;
		int can = 0;
		// 다음 형태로 출력하세요
		//	1  2  3  4  5
		//  16 17 18 19 6
		//  15 24 25 20 7
		//  14 23 22 21 8
		//  13 12 11 10 9
		
//		show(arr);
		
		while(size>0) {
			
			for (int j = 0; j < size; j++) {
			arr[line][can]=num;
			can++;	num++;						// 왜 can이 5까지 가지?
			}
			size--; can--; line++;		
			
			for (int i = 0; i < size; i++) {	// size=4
			arr[line][can]=num;			// line =1 can = 4
			line++;	num++;					// line  = 4
			}								// 
			can--;line--;
			for (int j = 0; j < size; j++) {	//size = 4
				arr[line][can]=num;				// line = 4 can =3
				can--; num++;					// line = 4 can = 0
			}
			size--;  line--; can++;			// size = 3 line = 3
			
			for (int i = 0; i < size; i++) {	//size = 3
				arr[line][can]=num;			// line = 3 can = 0
				line--; num++;				// line = 1
			}
			can++; line++;
		}
		show(arr);
	}

}
