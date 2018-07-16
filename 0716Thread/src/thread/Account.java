package thread;
public class Account {
	private int balance;

	// 잔액을 추가하는 메소드
	public synchronized void save() {
		System.out.println("입금전 잔액" + balance);
		balance = balance + 1000;
		notify();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("입금후 잔액" + balance);
	}

	// 잔액을 감소하는 메소드
	public synchronized void get() {

		if(balance<1000) {
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println("출금전 잔액" + balance);
		balance = balance - 1000;
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("출금후 잔액" + balance);
	}
}
