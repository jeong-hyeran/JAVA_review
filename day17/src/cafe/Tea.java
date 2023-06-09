package cafe;

public class Tea extends Cafe {
	
	String iceOrHot;

	public Tea(String name, int price, String iceOrHot) {
		super(name, price);
		this.iceOrHot = iceOrHot;
	}
	
	@Override
	public String toString() {
		String format = " %s ) %,d원, %s 음료 ";
		return String.format(format, name, price,iceOrHot);
	}

}
