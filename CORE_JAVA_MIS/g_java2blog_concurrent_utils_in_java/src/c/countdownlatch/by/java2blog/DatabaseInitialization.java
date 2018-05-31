package c.countdownlatch.by.java2blog;

import java.util.concurrent.CountDownLatch;

public class DatabaseInitialization implements Runnable {
	private CountDownLatch latch;

	public DatabaseInitialization(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		System.out.println("Initializing Database");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Done with database Initialization");
		latch.countDown();
	}

}
