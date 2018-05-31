package c.countdownlatch.by.amit.srivastava;

import java.util.concurrent.CountDownLatch;

public class Processor {
	//arg = pizz pasta salad
	public static void main(String[] args) {
		final CountDownLatch countDownLatch = new CountDownLatch(args.length);
		Thread foodProcessorThread = new Thread(new FoodProcessor(countDownLatch, args));
		foodProcessorThread.start();
		try {
			System.out.println("Order is received and is being processed");
			countDownLatch.await();
			System.out.println("Order is processed successfull and is ready to get dispatched");
		} catch (InterruptedException e) {
			e.printStackTrace();

		}

	}
}
