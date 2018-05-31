package E_VIDEO6;

import java.util.concurrent.TimeUnit;

public class FourthWay {
	//Annonymous class thread creating.
}

class FirstTask extends Thread {
	private static int count = 0;
	private int id;

	public void run() {
		for (int i = 10; i > 0; i--) {
			System.out.println("" + id + ">TICK TICK " + i);
			try {
				TimeUnit.MILLISECONDS.sleep(2000);
			} catch (InterruptedException e) {
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public FirstTask() {
		this.id = ++count;
	}
}