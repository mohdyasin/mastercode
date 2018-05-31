package d.cyclic.barier.by.amit;

import java.util.concurrent.CyclicBarrier;

public class CabBooking {
public static void main(String[] args) throws InterruptedException {
	CyclicBarrier cyclicBarrier = new CyclicBarrier(3);
			Thread t1 =new Thread(new CabService(cyclicBarrier));
			
			t1.setName("Passenger1");
			t1.start();
			Thread.sleep(12000);
			
			Thread t2 = new Thread(new CabService(cyclicBarrier));
			t2.setName("Passenger2");
			t2.start();
			Thread.sleep(12000);
			
			Thread t3 = new Thread(new CabService(cyclicBarrier));
			t3.setName("Passenger3");
			t3.start();
			Thread.sleep(12000);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
}
}
