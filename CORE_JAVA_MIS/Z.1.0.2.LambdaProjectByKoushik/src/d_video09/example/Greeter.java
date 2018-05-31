package d_video09.example;

public class Greeter {

	public void greet(Greeting greeting) {
		greeting.perform();
	}
	public static void main(String[] args) {
		
		Greeting greeter = new Greeting() {
			
			@Override
			public void perform() {
				System.out.println("Inner class to define implementation");
			}
		};
		Greeting greeting =()-> System.out.println("Lambda way to define implementation");
	
		greeter.perform();
		greeting.perform();
	}
	
	
}
