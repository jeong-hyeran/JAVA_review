package daiso;

public class Snack extends Daiso {
	String expirationDate;
	public Snack(String name, int price, String expirationDate) {
		super(name, price);
		this.expirationDate = expirationDate;
	}
	@Override
	public String toString() {
		String format = " %s ] 금액 : %,d원, 유효기간 : %s"	;
		Object[] args = {name, price, expirationDate };
		return String.format(format, args);
	}

}
