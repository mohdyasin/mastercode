package f_video11.example;

public class RunnableExample {
	public static void main(String[] args) {
		Thread myThread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Runnable annonymous implemenation");
			}
		});

		myThread.start();

		Thread lambdaThread = new Thread(() -> System.out.println("Runnable Lambda implemenation"));
		lambdaThread.start();
	
	
		Runnable runnableLambda = ()-> System.out.println("Runnable Lambda way to define the implemetation");
		Thread threadLambda = new Thread(runnableLambda);
		threadLambda.start();
	}
}
