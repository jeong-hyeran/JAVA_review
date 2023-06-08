package daiso;

public class Toy extends Daiso {
	int ageOfUse;

	public Toy(String name, int price, int ageOfUse) {
		super(name, price);
		this.ageOfUse = ageOfUse;
	}

	@Override
	public String toString() {
		String format = " %s ] 금액 : %,d원, 이용연령 : %d세";
		Object[] ags = {name, price,ageOfUse};
		return String.format(format, ags);
	}

}
