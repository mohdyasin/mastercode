package b.blocking.queue.by.java2blog;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueMain {

	public static void main(String args[]) {
		BlockingQueue queue = new ArrayBlockingQueue(1);
		Producer producer = new Producer(queue);
		Consumer consumer = new Consumer(queue);
		new Thread(producer).start();
		new Thread(consumer).start();
	}
}
