package thread;
public class AccountMain {

	public static void main(String[] args) {
		Account account = new Account();
		//잔액이 없는데도 잔액을 감소시키는 메소드가 수행이 되서 잔액이 음수 현상이 발생한다. 
		//잔액이 1000보다 작을 때는 잔액을 
		ThreadAccount1 th1 = new ThreadAccount1(account);
		th1.start();
		ThreadAccount2 th2 = new ThreadAccount2(account);
		th2.start();

	}

}
