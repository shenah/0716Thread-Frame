package thread;
public class ThreadMain {

	public static void main(String[] args) {
		//Ŭ������ run �޼ҵ� ���
		Thread th1 = new Thread();
		//���� ������� ����- �ٸ� �����尡 �۾����� �ƴϸ� �ڵ� ����
		th1.setDaemon(true);
		
		th1.start();
		try {
			Thread.sleep(2000);
			//interruptException�� �߻���ŵ�ϴ�.
			th1.interrupt();
			Thread.sleep(3000);

			System.out.println("���� ����");
			//System.exit(0);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
