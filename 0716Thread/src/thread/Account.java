package thread;
public class Account {
	private int balance;

	// �ܾ��� �߰��ϴ� �޼ҵ�
	public synchronized void save() {
		System.out.println("�Ա��� �ܾ�" + balance);
		balance = balance + 1000;
		notify();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("�Ա��� �ܾ�" + balance);
	}

	// �ܾ��� �����ϴ� �޼ҵ�
	public synchronized void get() {

		if(balance<1000) {
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println("����� �ܾ�" + balance);
		balance = balance - 1000;
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("����� �ܾ�" + balance);
	}
}
