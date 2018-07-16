package frame;

import java.awt.Button;

import java.awt.Color;

public class ColorThread extends Thread {
	private Button button;

	public ColorThread(Button button) {
		this.button = button;
	}

	public void run() {
		Color[] color = { Color.RED, Color.BLUE, Color.GREEN };
		int idx = 0;
		while (true) {
			try {
				button.setBackground(color[idx % color.length]);
				idx = idx + 1;
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}
