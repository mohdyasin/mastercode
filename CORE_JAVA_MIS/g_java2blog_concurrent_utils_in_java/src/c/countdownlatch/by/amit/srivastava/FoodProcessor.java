package c.countdownlatch.by.amit.srivastava;

import java.util.concurrent.CountDownLatch;

public class FoodProcessor implements Runnable {

	private final CountDownLatch countDownLatch;
	private String[] items;

	public FoodProcessor(CountDownLatch countDownLatch, String[] items) {
		this.countDownLatch = countDownLatch;
		this.items = items;
	}

	@Override
	public void run() {
		for (int i = 0; i < items.length; i++) {
			try {
				Thread.sleep(10000);
				System.out.println("Before processing the item, value of countdownlatch :: " + countDownLatch.getCount());
				System.out.println("Item " + items[i] + " is prepared");
				countDownLatch.countDown();
				System.out.println("After processing the item, value of countdown : " + countDownLatch.getCount());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
