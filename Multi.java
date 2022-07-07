package Package_2;

//thread example by extending thread class
class Multi extends Thread {
	public void run() {
		System.out.println("Running a thread...");
	}

	public static void main(String[] args) {
		Multi t = new Multi();
       // t1.run();
		t.start();
		

	}

}



