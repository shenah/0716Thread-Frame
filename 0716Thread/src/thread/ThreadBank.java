package thread;
public class ThreadBank extends Thread {
	private Bank bank;
	private String name;

	// �����ڿ��� Bank �� ���ڿ� 1�� ���Թޱ�
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
