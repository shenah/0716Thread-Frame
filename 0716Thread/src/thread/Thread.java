package thread;
public class Thread extends java.lang.Thread {

	//스레드로 동작할 메소드
	public void run() {
		//1초마다 Thread라는 글자를 10번 출력
		for(int i=0;i<10;i++) {
			System.out.println("Thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("스레드 종료");
				//스레드를 강제종료할 수 있도록 예외가 발생하면 run 메소드 종료.
				return;
			}
		}
	}
}
