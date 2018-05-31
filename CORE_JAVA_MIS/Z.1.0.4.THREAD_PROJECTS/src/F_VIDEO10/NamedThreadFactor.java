package F_VIDEO10;

import java.util.concurrent.ThreadFactory;

public class NamedThreadFactor implements ThreadFactory{

	private static int count =0;
	private static String NAME = "My-Thread-1";

	@Override
	public Thread newThread(Runnable r) {
		Thread t = new Thread(r, NAME + ++count);
		return t;
	}

}
