package nestedArray;

public class Quiz01 {
	static void show(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
			System.out.printf("%2d ",arr[i][j]);
		}
		System.out.println();
	}
	System.out.println();
	}
public static void main(String[] args) {
	int size = 5;
	int num = 1;
	int [][] arr = new int[size][size];
	
	// 다음형태로 출력하세요
	// 1   2   3   4   5
	// 16  17  18  19  6
	// 15  24  25  20  7
	// 14  23  22  21  8
	// 13  12  11  10  9
	/// if, for, while
//	int sign = -sign; 
	
		for(int j = 0 ; j < 5 ; j++){
			int i = 0;
			arr[i][j]=num++;
			}
		
		for(int i = 1 ; i < 5 ; i++) {
			int j = 4;
			arr[i][j]=num++;
		}
		
		for(int j = 0 ; j < 4 ; j++){
			int i = 4;
			arr[i][3-j]=num++;
		}
		
		for(int i = 0 ; i < 3 ; i++) {
			int j = 0;
			arr[3-i][j]=num++;
		}
		
		for(int j = 1 ; j < 4 ; j++){
			int i = 1;
			arr[i][j]=num++;
		}
		
		for(int i = 2 ; i < 4 ; i++) {
			int j = 3;
			arr[i][j]=num++;
		}
		
		for(int j = 1 ; j < 3 ; j++){
			int i = 3;
			arr[i][3-j]=num++;
		}
		
		for(int j = 1 ; j < 3 ; j++){
			int i = 2;
			arr[i][j]=num++;
		}
		
		
		
	
	show(arr);
}
}