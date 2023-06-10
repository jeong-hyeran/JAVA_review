package 정혜란1A;


public class Handler {
	Member[] arr = new Member[100];

	public int join(Member tmp) {
		int row = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = tmp;
				row++;
				break;
			}
		}
		
		return row;
	}

	public Member[] showMember() {
		return arr;
	}

	public Member[] search(String searchId) {
	
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].id.contains(searchId)) {
				count++;
			}
		}
		Member[] mem = new Member[count];
		count=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].id.contains(searchId)) {
				mem[count++]=arr[i]	;
						break;
			}
		}
		if(count==0) {System.err.printf("%s 회원을 찾을 수 없습니다.\n",searchId);
		}
		return mem;
	}
	

	public int delete(String id) {
		int row = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].id.contains(id)) {
				arr[i]=null;
				row++;
			}
		}
		return row;
	}

	public Member[] sort() {
		Member tmp;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] != null && arr[j] != null && arr[i].id.compareTo(arr[j].id)>0) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		return arr;
	}

}