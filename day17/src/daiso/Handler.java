package daiso;


public class Handler {
	
	Daiso [] arr = new Daiso[10];
	
	// 전체목록
	public Daiso[] showArr() {
		return arr;
	}

	// 추가
	public int add(Daiso tmp) {
		int row = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				arr[i] = tmp;
				row = 1;
				break;
			}
		}
		return row;
	}

	public Daiso[] search(String search) {
		Daiso[] s = null;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null && arr[i].name.contains(search)) {
				count++;
			}
		}
		
		s = new Daiso[count];
		count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null && arr[i].name.contains(search)) {
				s[count++] = arr[i];
			}
		}
		return s;
	}

	public int delete(String search) {
		int row =0 ;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=null&&arr[i].name.equals(search)) {
				arr[i]=null;
				row++;
			}
		}
		return row;
	}

	public Daiso[] sort(int num) {
		if(num==1) {
			for (int i = 0; i < arr.length-1; i++) {
				for (int j = i+1; j < arr.length; j++) {
					if(arr[i] != null  && arr[j] != null &&
							arr[i].name.compareTo(arr[j].name)>0) {
						Daiso tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
					}
				}
			}
		}
		else if(num == 2) {
			for (int i = 0; i < arr.length-1; i++) {
				for (int j = i+1; j < arr.length; j++) {
					if(arr[i] != null  && arr[j] != null &&
							arr[i].price -arr[j].price > 0) {
						Daiso tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
					}
				}
			}
		}
		return arr;
	}

}
