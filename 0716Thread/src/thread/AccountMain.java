package thread;
public class AccountMain {

	public static void main(String[] args) {
		Account account = new Account();
		//�ܾ��� ���µ��� �ܾ��� ���ҽ�Ű�� �޼ҵ尡 ������ �Ǽ� �ܾ��� ���� ������ �߻��Ѵ�. 
		//�ܾ��� 1000���� ���� ���� �ܾ��� 
		ThreadAccount1 th1 = new ThreadAccount1(account);
		th1.start();
		ThreadAccount2 th2 = new ThreadAccount2(account);
		th2.start();

	}

}
