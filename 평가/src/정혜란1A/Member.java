package 정혜란1A;

public abstract class Member {
	public String id;
	public String pw;
	public String name;
	

	
	public Member(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	
	public abstract String toString();
	
}