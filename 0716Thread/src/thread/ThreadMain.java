package thread;
public class ThreadMain {

	public static void main(String[] args) {
		//클래스의 run 메소드 사용
		Thread th1 = new Thread();
		//데몬 스레드로 설정- 다른 스레드가 작업중이 아니면 자동 종료
		th1.setDaemon(true);
		
		th1.start();
		try {
			Thread.sleep(2000);
			//interruptException을 발생시킵니다.
			th1.interrupt();
			Thread.sleep(3000);

			System.out.println("메인 종료");
			//System.exit(0);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
