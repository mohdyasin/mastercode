package video19.example;

public class A_V_19_CLOSURE_IN_JAVA_7_ONE {

	public static void main(String[] args) {
		int a =10;
		int b =20;// in java 7 it has to be final if you are using in annymous class
		doProcess(a, new Process() {

			@Override
			public void process(int i) {
				//b = 30;if you will try to change then it will show CTE[Local variable b defined in an enclosing scope must be final or effectively final] both and java8
				System.out.println(i + b);
			}
			
		});
	}
	public static void doProcess(int i, Process p) {
		p.process(i);
	}
	interface Process{
		void process(int i);
	}
}
