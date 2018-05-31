package b_video02.example;

public interface I1 {

	default void show() {
		System.out.println("I1");
	}
	
	 static void showStatic() {
		System.out.println("I1");
	}
}
