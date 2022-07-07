package Package_2;

class MultiThread extends Multi {
	public void run() {
		System.out.println("Running Thread Name : " + this.currentThread().getName());
		System.out.println("Running Thread Priority : " + this.currentThread().getPriority());
	}
}

public class ThreadPriority {

	public static void main(String[] args) {
		MultiThread t1 = new MultiThread();
		t1.setName("First Thread");
		t1.setPriority(Multi.MIN_PRIORITY);

		MultiThread t2 = new MultiThread();
		t2.setName("Second Thread");
		t2.setPriority(Multi.MAX_PRIORITY);

		MultiThread t3 = new MultiThread();
		t3.setName("Third Thread");

		t1.start();
		t2.start();
		t3.start();

	}

}
