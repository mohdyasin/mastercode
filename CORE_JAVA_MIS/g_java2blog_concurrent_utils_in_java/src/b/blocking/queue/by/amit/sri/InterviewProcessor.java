package b.blocking.queue.by.amit.sri;

import java.util.concurrent.BlockingQueue;

public class InterviewProcessor implements Runnable {
	private BlockingQueue<String> queue;

	public InterviewProcessor(BlockingQueue<String> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			String msg;
			Thread.sleep(10000);
			while (!(msg = queue.take()).equals("Stop")) {
				System.out.println("Interview completed for " + msg);
				Thread.sleep(10000);
			}
			System.out.println("Interview completed for all candidates");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
