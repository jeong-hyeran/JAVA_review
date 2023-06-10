package 정혜란1A;

public class Customer  extends Member {
	private String address;

	public Customer(String id, String pw, String name, String address) {
		super(id, pw, name);
		this.address = address;		// 고객 주소
	}

	@Override
	public String toString() {
		String format = "[구매자정보]\nID : %s\nPW : ******** \n이름 : %s\n배송주소 : %s\n";
		Object[] args = {id, name, address};
		return String.format(format, args);
	}

}