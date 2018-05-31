package b.threadpoolexecutor.example.two;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;


public class RejectTaskHandler implements RejectedExecutionHandler {

	@Override
	public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
		FetchDataFromFile ffdf = (FetchDataFromFile) r;
		System.out.println("Sorry!! We won't be able to read :" + ffdf.getFileName());
	}
}