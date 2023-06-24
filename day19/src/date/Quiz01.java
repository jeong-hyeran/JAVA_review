package date;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Quiz01 {
	// 매월 2주, 4주 일요일은 대형마트 휴무일입니다
	// 2023년 대형마트 휴무일은 총 몇일인지 계산하여 출력하세요
	
	// 각 휴무 날짜를 반복문을 이용하여 출력해보세요
	// 서식은 자유롭게 작성하되, 연월일과 요일은 반드시 포함되어야 합니다.
	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd E요일");

		Date d1 = sdf.parse("2023-01-01");
		Date d2 = sdf.parse("2023-12-31");
		
		String month = "";
		int count =1;
		int sum =0 ;

		for (long i = d1.getTime(); i <= d2.getTime(); i += 1000 * 60 * 60 * 24) {
			String s = sdf1.format(i);
			if (s.contains("일요일")) {
				if(month.equals(s.substring(5,7))==false) {
					System.out.println();
					count=1;
				}
				if(count ==2 || count == 4) {
				System.out.printf("%s [%d]\n",s,count);
				sum ++;
				}
				month = s.substring(5,7);
				count++;
			}
		}
		
		System.out.println("휴무일 :" + sum);
		
		
		
	}

}