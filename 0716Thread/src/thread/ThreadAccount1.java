package thread;
public class ThreadAccount1 extends Thread {

	private Account account;

	public ThreadAccount1(Account account) {
		this.account = account;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			account.save();
		}
	}
}
