package book;

public class Handler {

	private Book[] arr = new Book[10]; 												// 책 정보를 넣은 배열 생성
	private Book[] cart = new Book[5];

	// book타입의 객체를 추가
	public int add(Book sort) {															 /// ??? 왜 int형으로 메소드를 생성해야하는가,왜 매개변수는 북타입으로 넣어야하는가
		int row = 0; 																	// 한번 추가되면 그만 하기 위한 변수
		for (int i = 0; i < arr.length; i++) { 											// 북 배열의 길이만큼 반복 할때
			if (arr[i] == null) {														// arr의 i인데스 자리가 비어 있으면
				arr[i] = sort; 															// book의 sort를 그 자리에 넣는다.
				row = 1; 																// if문이 true여서 들어오면 row가 하나 증가
				break; 																	// 한개를 추가하면 그대로 종료
			}
		}
		return row; 																	// 메소드가 정수로 반환받는 형태여서 꼭 return을 적어야 한다.
	} 																					// row로 추가 되었는지 안되었는지 확인 할 예정

	// 전체 목록을 반환
	public Book[] getArray() { 															// ?? book의 타입의 목록을 한번에 보기 위한 함수
		return arr;
	}

	/// 전체 목록, 추가, 검색(포함), 삭제(제목 다정확하게 넣어서)
	public Book[] search(String keyword) {
		Book[] result = null; 															// 결과를 내보낼 배열 생성
		int count = 0; 																	// keyword랑 같은 sort 개수를 파악하기 위한 변수
		for (int i = 0; i < arr.length; i++) { 											// arr의 길이만큼 반복하며
//			if(arr[i] != null && arr[i].getName().contains(keyword)) {					//arr의 i인덱스에 비어있지 않거나, 키워드의 단어가 포함되어있다면
			if (arr[i] != null && (arr[i].getName().contains(keyword) 
					|| arr[i].getWriter().contains(keyword))) { 						// arr의 i인덱스에 비어있지 않거나,
																						// 키워드의 단어가 포함되어있다면
				count++; 																// if문으로 들어와서 count가 1이된다.
			}
		}
		result = new Book[count]; 														// keyword와 일치하는 객체의 수 만큼 배열 생성
		int index = 0; 																	// for문의 i와는 다르게 result의 인덱스를 지정해주기위한 변수
		for (int i = 0; i < arr.length; i++) {
//			if(arr[i] != null && arr[i].getName().contains(keyword)) { 					//arr의 i인덱스에 비어있지 않거나, 키워드의 단어가 포함되어있다면
			if (arr[i] != null && (arr[i].getName().contains(keyword) 
					|| arr[i].getWriter().contains(keyword))) { 						// arr의 i인덱스에 비어있지 않거나,
																						// 키워드의 단어가 포함되어있다면
				result[index++] = arr[i]; 												// result의 배열 index에 arr의 i인덱스 값을 넣어준다.
			}
		}
		return result; 																	// result 배열에 있는 book객체를 반환한다.
	}

	public int delete(String name) {
		int row = 0; // 삭제 여부 확인을 위한 변수
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null && arr[i].getName().equals(name)) {// arr의 i인덱스에 비어있지 않거나, 이름이 정확히 똑같다면
				arr[i] = null; // arr의 i인덱스에 null을 넣어준다.
				row = 1; // null을 넣어주면 삭제, 삭제를 하면 row에 1을 넣어준다.
				break; // 하나를 삭제하면 그대로 종료
			}
		}
		return row; // 삭제가 되었다면 1, 안되었다면 0을 반환 한다.
	}

	public Book[] addCart(String keyword) {
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null && (arr[i].getName().contains(keyword) || arr[i].getWriter().contains(keyword))) {
				if(cart[j]==null) {
					
					cart[j] = arr[i];
				}
				j++;
			}
		}///???? 한번 담은 장바구니 하나만 출력이 된다..?!
		return cart;
	}

	public Book[] getCart() { // ?? book의 타입의 목록을 한번에 보기 위한 함수
		return cart;
	}

}
