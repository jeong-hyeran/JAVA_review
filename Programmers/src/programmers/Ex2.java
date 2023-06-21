package programmers;

class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        for(int i = 0; i < index_list.length-1; i++) {
        answer += my_string.charAt(index_list[i]);	
//        char answer1 = my_string.charAt(16);
//        System.out.println(answer1);
        }
        return answer;
    }
}


public class Ex2 {
	public static void main(String[] args) {
		String my_string = "cvsgiorszzzmrpaqpe";
		int index_list[]= {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
		Solution sol = new Solution();
		sol.solution(my_string, index_list);
		System.out.println(sol.solution(my_string, index_list));
		
	}

}
