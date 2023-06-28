package file;

import java.io.File;

public class Ex05 {

	public static void main(String[] args) throws Exception {

		File f1 = new File("a.txt");
		File f2 = new File("C:\\upload", "b.txt");
		File dir = new File("C:\\upload");
		File f3 = new File(dir, "c.txt");
		
		System.out.println("f1이 존재하는가 : " + f1.exists());
		System.out.println("f2이 존재하는가 : " + f2.exists());
		System.out.println("dir이 존재하는가 : " + dir.exists());
		System.out.println("f3이 존재하는가 : " + f3.exists());
		System.out.println();
		
		if(f1.exists()==false) {
			boolean flag = f1.createNewFile();
			System.out.println("f1이 생성되었는가? " + f1.exists());
		}
		
		
	}

}
