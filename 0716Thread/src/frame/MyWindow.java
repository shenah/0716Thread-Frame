package frame;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Panel;

public class MyWindow extends Frame {
	// 생성자
	public MyWindow() {

		setBackground(Color.BLUE);
		setSize(1000, 1000);
		setLocation(500, 500);
		setTitle("나의 첫번째 윈도우 프로그램");

		/* Dialog dialog = new Dialog(this); 
		 * dialog.setSize(200, 200);*/

		Panel panel = new Panel();

		Button btn1 = new Button("버튼");
		// 버튼의 배경색을 변경하는 스레드.
		Thread th1 = new Thread() {
			public void run() {
				Color[] color = { Color.RED, Color.GRAY, Color.GREEN };
				int idx = 0;
				while (true) {
					try {
						btn1.setBackground(color[idx % color.length]);
						idx = idx + 1;
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		th1.start();

		Button btn2 = new Button("버튼");
		// 버튼의 텍스트를 변경하는 스레드.
		Thread th2 = new Thread() {
			public void run() {
				String[] str = { "Java", "Oracle", "C" };
				int idx = 0;
				while (true) {
					try {
						btn2.setLabel(str[idx % str.length]);
						idx = idx + 1;
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		th2.start();

		// add(btn1); //윈도우 크기
		panel.add(btn1);
		panel.add(btn2);
		add(panel);

		setVisible(true);
	}
}
