package File;

import java.io.File;
import java.io.FileWriter;

public class Ex08 {
	public static void main(String[] args) throws Exception {

		File f = new File("a.txt");

		if (f.exists() == false) {
			f.createNewFile();		/// 파일 만듦
		}

		// 기존 내용을 유지하고 아래쪽에 내용을 추가할 것인가?
//		boolean append = true;		/// 기존내용을 유지하고 실행 할때마다 추가되어 실행
		boolean append = false;		/// 기존 내용 삭제 하고 실행
		
		FileWriter fw = new FileWriter(f,append);
		/// FileWriter이라는 클래스
		fw.append("Hello\n");
		fw.append("World\n");
		fw.append("java\n");
		fw.append("한글\n");
		fw.flush();
		fw.close();

		System.out.println("완료");
	}

}
