package frame;

import java.awt.Button;

public class TextThread extends Thread {
	private Button button;

	public TextThread(Button button) {
		this.button = button;
	}

	public void run() {
		String[] str = { "Java", "Oracle", "C" };
		int idx = 0;
		while (true) {
			try {
				button.setLabel(str[idx % str.length]);
				idx = idx + 1;
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
