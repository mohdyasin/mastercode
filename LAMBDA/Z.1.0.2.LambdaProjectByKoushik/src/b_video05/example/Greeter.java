package b_video05.example;

public class Greeter {

	public void greet(Greeting greeting) {
		greeting.perform();
	}
	public static void main(String[] args) {
		HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
		Greeter greeter = new Greeter();
		greeter.greet(helloWorldGreeting);
	}
}
