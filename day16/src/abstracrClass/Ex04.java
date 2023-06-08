package abstracrClass;

import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;

interface Test1{
	public static final int n1 = 10;
	int n2 = 20;
	
	public abstract void show();
}

class Test2 implements Test1, Serializable, Closeable {

	private static final long serialVersionUID = 1L;@Override
	public void show() {
		System.out.printf("%d, %d\n", n1, n2);
	}

	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		
	}


}

public class Ex04 {

}
