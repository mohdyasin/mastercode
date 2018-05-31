package d.cyclic.barier.by.amit;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CabService implements Runnable {
	private CyclicBarrier cyclicBarrier;
	
	public CabService(CyclicBarrier cyclicBarrier) {
		this.cyclicBarrier = cyclicBarrier;
	}
	@Override
	public void run() {
		try {
			System.out.println("++++++++ " + Thread.currentThread().getName() + " has arrived");
			try {
				cyclicBarrier.await();
			}catch(BrokenBarrierException e) {
				e.printStackTrace();
			}
			System.out.println("+++++++ " + Thread.currentThread().getName() + " is going to board the cab");
		}catch(InterruptedException e) {
			e.printStackTrace();
		}

	}

}









