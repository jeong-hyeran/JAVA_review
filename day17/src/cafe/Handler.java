package cafe;

import java.util.Iterator;

public class Handler {
	
	Cafe[] arr = new Cafe[10];   ///****
	
	public Cafe[] showArr() {
		return arr;
	}

	public int add(Cafe tmp) {
		int row = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				arr[i]=tmp;
				row=1;
				break;
			}
		}
		return row;
	}

	public Cafe[] search(String search) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null && arr[i].name.contains(search)) {
				count++;
			}
		}
		Cafe[] s = new Cafe[count];
		count =0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null && arr[i].name.contains(search)) {
				s[count++] = arr[i];
			}
		}
		return s;
	}

	public int delete(String name) {
		int row =0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].name.equals(name)) {
				arr[i] = null;
				row++;
				break;
			}
		}
		return row;
	}

	public Cafe[] sort() {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] != null && arr[j] != null && arr[i].name.compareTo(arr[j].name)>0) {
					Cafe tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		return arr;
	}

}
