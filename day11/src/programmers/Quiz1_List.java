package programmers;
//package programmers;
//
//import java.util.Arrays;
//
//class Solution2{
//	public int solution(int [][] board, int [] moves) {
//		int answer = 0;
//		ArrayList<Integer> basket = new ArrayList<>();
//		
//		for (int i = 0; i < moves.length; i++) {
//			int index = moves[i]-1;
//			for (int j = 0; j < board.length; j++) {
//				if(board[j][index]!=0) {
//					int size = basket.size();
//					if(board[j][index]!=0) {
//						if(size >= 1 && board[j][index] == basket.get(size-1)) {
//							basket.remove(size-1);
//							answer +=2;
//						}
//						else {
//							basket.add(board[j][index]);
//						}
//						board[j][index]=0;
//						break;
//					}
//				}
//			}
//			return answer;
//		}
//	}
//
//public class Quiz1_List {
//	static void show(int[][] board) {
//		for(int i = 0; i < board.length; i++) {
//			for(int j = 0; j < board[i].length; j++) {
//				String s = "";
//				switch(board[i][j]) {
//				case 0: 	s = "     ";	break;
//				case 1: 	s = "😎";		break;
//				case 2: 	s = "😍";		break;
//				case 3: 	s = "😛";		break;
//				case 4: 	s = "😆";		break;
//				case 5: 	s = "😀";		break;
//				}
//				System.out.print(s + " ");
////				System.out.print(board[i][j] + " ");
//			}
//			System.out.println();
//		}
//		System.out.println();
//	}
//	
//	public static void main(String[] args) {
//		// main함수는 변경하지 않습니다 !!
//		Solution2 s = new Solution2();
//		int[][] board = {
//				{0, 0, 0, 0, 0},	
//				{0, 0, 1, 0, 3},	
//				{0, 2, 5, 0, 1},	
//				{4, 2, 4, 4, 2},	
//				{3, 5, 1, 3, 1},	
//		};
//		int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };
//		
//		show(board);
//		
//		int answer = s.solution(board, moves);
//		
//		show(board);
//		System.out.println(answer == 4 ? "정답" : "오답");
//	}
//}
//
//
//
//public class Quiz1 {
//
//}
