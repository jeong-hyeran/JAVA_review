package programmers;

import java.util.Arrays;

class Solution {
	public int solution(int[][] board, int[] moves) {
		int answer = 0;

		System.out.println(Arrays.toString(moves));
		int[] basket = new int[moves.length];

		for (int i = 0; i < moves.length; i++) {
			int index = moves[i] - 1;
			int get = 0;
			for (int j = 0; j < board.length; j++) {
				if (board[j][index] != 0) {
					get = board[j][index];
					board[j][index] = 0;
					break;
				}
			}

			for (int j = 0; j < basket.length; j++) {
				if (basket[j] == 0) {
					basket[j] = get;
					break;
				}
			}
			System.out.println(get +" : " + Arrays.toString(basket));
			
			for (int j = 0; j < basket.length; j++) {
				if(basket[j] != 0 && basket[j]==basket[j+1]) {
					basket[j]=0;
					basket[j+1] = 0;
					answer += 2;
				}
			}
		}
		return answer;
	}
}

public class Quiz01 {
	static void show(int[][] board) {
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				String s = "";
				switch(board[i][j]) {
				case 0: 	s = "  ";	break;
				case 1: 	s = "😎";		break;
				case 2: 	s = "😍";		break;
				case 3: 	s = "😛";		break;
				case 4: 	s = "😆";		break;
				case 5: 	s = "😀";		break;
				}
				System.out.print(s + " ");
//				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
	Solution s = new Solution();
	int[][] board = {
			{0, 0, 0, 0, 0},	
			{0, 0, 1, 0, 3},	
			{0, 2, 5, 0, 1},	
			{4, 2, 4, 4, 2},	
			{3, 5, 1, 3, 1},	
	};
	int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };
	
	show(board);
	
	int answer = s.solution(board, moves);
	
	show(board);
	System.out.println(answer == 4 ? "정답" : "오답");
}

}
