package book;
/// 전체 목록, 추가, 검색(포함), 삭제(제목 다정확하게 넣어서)

public class Handler {
	
	private Book[] arr = new Book[10];
	
	public int add(Book sort) {
		int row = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
			  arr[i] = sort;
			  row+=1;			
			  break;
			}
		}
		return row;
//		System.out.print(row==0?"실패": "성공");
	}
	
	public Book[] getArray() {
		return arr;
	}
	
	public String search (String keyword) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=null && arr[i].getName().contains(keyword)) {
				
			}
		}
	}
}
