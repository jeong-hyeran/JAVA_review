package accessModifier;

class Test1{
	private int n1 = 10;
	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	/*package*/ int n2 = 20;
	protected int n3 = 30;
	public int n4 = 40;
	
	void show() {
		System.out.println("n1 : " + n1);	
		System.out.println("n2 : " + n2);
		System.out.println("n3 : " + n3);
		System.out.println("n4 : " + n4);
		System.out.println();
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Test1 ob = new Test1();
		
		ob.setN1(0);
		ob.n2 = 15;
		ob.n3 = 15;
		ob.n4 = 15;
	}

}
