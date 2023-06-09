package cafe;

public class Coffee extends Cafe{

	String madeIn;
	public Coffee(String name, int price, String madeIn) {
		super(name, price);
		this.madeIn=madeIn;
	}
	
	@Override
	public String toString() {
		String format = " %s ) %,d원, 원산지 : %s";
//		String.format(format, name, price,madeIn);
		return String.format(format, name, price,madeIn);
	}

	
	
	
}
