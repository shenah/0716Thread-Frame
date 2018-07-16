package thread;
public class ThreadBank extends Thread {
	private Bank bank;
	private String name;

	// 생성자에서 Bank 와 문자열 1개 대입받기
	public ThreadBank(Bank bank, String name) {
		this.bank = bank;
		this.name = name;
	}

	public void run() {
		for (int i = 0; i < 3; i++) {
			bank.job(name);
		}

	}

}
