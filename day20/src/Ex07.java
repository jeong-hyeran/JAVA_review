import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) throws Exception {
		File f = new File("한국배우목록.txt");
		System.out.println(f);
		System.out.println(f.toString());
		System.out.println(f.getName());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.length());
		System.out.println();
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		Scanner sc = new Scanner(f);
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			if(line.length()==3) {
				String key = line.substring(0,1);
				map.put(key, map.getOrDefault(key, 0)+1);
			}
		}
		sc.close();
		
		for(String key :  map.keySet()) {
			int value = map.get(key);
			System.out.printf("%s씨는 %d명\n", key, value);
		}
		System.out.println();
		
		System.out.println(map);
		
		ArrayList<String> list = new ArrayList<String>();
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			int value = map.get(key);
			list.add(key + "=" + value);
		}
		
		list.sort(null);
		list.forEach(s->System.out.println(s));
	}

}
