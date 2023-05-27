package loop;

public class Quiz1 {
	/*
	 *   *   * 
	   *   *   
	 *   *   * 
	   *   *   
	 *   *   * 
	출력하기
	 */
	public static void main(String[] args) {
		String s1 = "* ",s2 = "  ",s3 ="\n";
		String str="";
		for (int i = 1; i <= 25; i++) {
			if(i%2!=0) {
				str+=s1;
			}else {
				str+=s2;
			}
			if(i%5==0) {
				str+=s3;
			}
		}
		System.out.print(str);
	}

}
