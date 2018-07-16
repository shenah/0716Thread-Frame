package thread;
public class BankMain {

	public static void main(String[] args) {
		Bank bank = new Bank();
		//
		ThreadBank atm = new ThreadBank(bank, "ATM");
		atm.start();

		ThreadBank internet = new ThreadBank(bank, "Internet");
		internet.start();
	}

}
