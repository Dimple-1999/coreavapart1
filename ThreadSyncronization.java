package Package_2;

class Account {
	public int balance;
	public int accountNo;

	void displayBalance() {
		System.out.println("Account No :  " + accountNo + ", Balance : " + balance);
	}

	synchronized void deposit(int amount) {
		balance = balance + amount;
		System.out.println(amount + " is deposited");
		displayBalance();
	}

	synchronized void withdraw(int amount) {
		balance = balance - amount;
		System.out.println(amount + "is withdrawn");
		displayBalance();
	}
}

class TransactionDeposit implements Runnable {
	int amount;
	Account accountX;

	TransactionDeposit(Account x, int amount) {
		accountX = x;
		this.amount = amount;
		new Thread(this).start();
	}

	public void run() {
		accountX.deposit(amount);
	}
}

class TransactionWithdraw implements Runnable {
	int amount;
	Account accountY;

	TransactionWithdraw(Account y, int amount) {
		accountY = y;
		this.amount = amount;
		new Thread(this).start();
	}

	public void run() {
		accountY.deposit(amount);
	}
}

class ThreadSyncronization {
	public static void main(String[] args) {
		Account ac = new Account();
		ac.accountNo = 555;
		ac.balance = 50000;
		TransactionDeposit t1 = new TransactionDeposit(ac, 20000);
		TransactionWithdraw t2 = new TransactionWithdraw(ac, 30000);

	}

}
