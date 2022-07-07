package Package_2;

class Table {
	synchronized void printTable(int n) {
		for (int i = 1; i < 5; i++) {
			System.out.println(n + "*" + i + "=" + (n * i));
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class Table1 extends Thread {
	Table t;

	Table1(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}
}

class Table2 extends Thread {
	Table t;

	Table2(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}
}

public class TestSynchronization {

	public static void main(String[] args) {
		Table a1 = new Table();
		Table1 t1 = new Table1(a1);
		Table2 t2 = new Table2(a1);
		t1.start();
		t2.start();
	}

}
