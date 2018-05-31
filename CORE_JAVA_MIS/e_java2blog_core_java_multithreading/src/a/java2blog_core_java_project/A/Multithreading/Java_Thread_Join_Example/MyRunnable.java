package a.java2blog_core_java_project.A.Multithreading.Java_Thread_Join_Example;

public class MyRunnable implements Runnable {

	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " Start");
			// thread sleeps for 4 secs
			Thread.sleep(4000);
			System.out.println(Thread.currentThread().getName() + " end");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}