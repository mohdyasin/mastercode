package video21.example;

public class MethodReferenceExample1 {

	public static void main(String[] args) {
		
		Thread t = new Thread(()->printMessage());
		t.start();
		
		//or
		Thread t1 = new Thread(MethodReferenceExample1::printMessage);// same as ()->printMessage()
		t1.start();
	}
	public static void printMessage() {
		System.out.println("Hello");
	}
}
