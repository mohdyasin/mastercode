package F_VIDEO10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NAMING_EXECUTOR_THREAD {

	public static void main(String[] args) {
	String currentThreadName = Thread.currentThread().getName();
	System.out.println("[" + currentThreadName + "] main thread starts here..." );
	ExecutorService exeService = Executors.newCachedThreadPool(new NamedThreadFactor());
	exeService.execute(new LoopTaskC());
	exeService.execute(new LoopTaskC());
	exeService.execute(new LoopTaskC());
	
	System.out.println("[" + currentThreadName + "] Main thread ends here");
	}
}
