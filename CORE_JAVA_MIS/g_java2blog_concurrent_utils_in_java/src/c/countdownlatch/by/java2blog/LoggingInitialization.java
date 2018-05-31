package c.countdownlatch.by.java2blog;

import java.util.concurrent.CountDownLatch;

public class LoggingInitialization implements Runnable {
	private CountDownLatch latch;

	public LoggingInitialization(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		System.out.println("Initializing Logging");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Done with Logging Initialization");
		latch.countDown();
	}

}
