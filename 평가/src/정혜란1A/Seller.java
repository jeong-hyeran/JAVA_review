package 정혜란1A;

public class Seller extends Member {
	private String store;

	public Seller(String id, String pw, String name, String delivery) {
		super(id, pw, name);
		this.store = delivery;  // 배송주소
	}

	@Override
	public String toString() {
		String format = "[판매자정보]\nID : %s\nPW : ******* \n이름 : %s\n가게이름 : %s\n";
		Object[] args = {id, name, store};
		return String.format(format,args);
	}

}