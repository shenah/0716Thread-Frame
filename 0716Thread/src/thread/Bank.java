package thread;
public class Bank {
	// 잔액을 저장할 변수
	private int balance = 1000;

	// 잔액을 변경하는 메소드
	public void job(String msg) {
		synchronized(this){
			System.out.println(msg + "현재잔액:" + balance);
			balance = balance - 100;

			// 1초 대기
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(msg + "작업후 현재 잔액:" + balance);
		}
	}

}
