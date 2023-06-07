package inheritance;


class Pos {
	int x;
	int y;

	Pos(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void show() {
		System.out.println("x : " + x + ", y : " + y);
	}
}

class Pos3D extends Pos{
	int z;
	Pos3D(int x, int y, int z){
		super(x,y);
		this.z=z;
	}
	void show() {
		System.out.printf("x : %d, y : %d, z : %d", x, y, z);
		}
	}

	public class Ex04 {
		public static void main(String[] args) {
			Pos ob1 = new Pos(2, 3);
			ob1.show();

			Pos3D ob2 = new Pos3D(4, 7, 1);
			ob2.show();
			
		}}