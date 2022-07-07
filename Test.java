package Package_2;

class One extends Thread {
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(i);
		}
	}
}

public class Test {

	public static void main(String[] args) {
		Test t = new Test();
		t.call(new One());
	
	}
	public void call(One o) {
		o.start();
	}

}
