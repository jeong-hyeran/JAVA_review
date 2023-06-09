package daiso;

public abstract class Daiso {
	String name;
	int price;
	
	public Daiso(String name, int price) {
		this.name = name;
		this.price = price;
	}
public abstract String toString();
}
