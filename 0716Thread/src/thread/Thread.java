package thread;
public class Thread extends java.lang.Thread {

	//������� ������ �޼ҵ�
	public void run() {
		//1�ʸ��� Thread��� ���ڸ� 10�� ���
		for(int i=0;i<10;i++) {
			System.out.println("Thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("������ ����");
				//�����带 ���������� �� �ֵ��� ���ܰ� �߻��ϸ� run �޼ҵ� ����.
				return;
			}
		}
	}
}
