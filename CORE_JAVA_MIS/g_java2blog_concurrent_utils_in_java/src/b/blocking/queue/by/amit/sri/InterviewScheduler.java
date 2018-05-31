package b.blocking.queue.by.amit.sri;

import java.util.concurrent.BlockingQueue;

public class InterviewScheduler implements Runnable {
	private BlockingQueue<String> queue;

	public InterviewScheduler(BlockingQueue<String> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		System.out.println("10 Condidates have arrived");
		for (int i = 1; i <= 10; i++) {
			String msg = new String("Condidate " + i);
			try {
				queue.put(msg);
				System.out.println("Interview scheduled for " + msg);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Interview scheduled for all candidates");
		String msg = new String("Stop");
		try {
			queue.put(msg);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
