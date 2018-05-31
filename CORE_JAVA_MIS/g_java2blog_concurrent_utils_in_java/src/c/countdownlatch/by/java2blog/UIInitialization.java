package c.countdownlatch.by.java2blog;

import java.util.concurrent.CountDownLatch;

public class UIInitialization implements Runnable {
	private CountDownLatch latch;

	public UIInitialization(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		System.out.println("Initializing UI");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Done with UI Initialization");
		latch.countDown();
	}

}
