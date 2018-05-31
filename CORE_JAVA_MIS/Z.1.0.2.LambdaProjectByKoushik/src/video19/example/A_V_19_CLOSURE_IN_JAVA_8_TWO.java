package video19.example;

public class A_V_19_CLOSURE_IN_JAVA_8_TWO {

	public static void main(String[] args) {
		int a =10;
		int b =20;// in java 7 it has to be final if you are using in annymous class
		doProcess(a, 
				p-> {
					System.out.println(p + b); 	
				}
		);
	}
	public static void doProcess(int i, Process p) {
		p.process(i);
	}
	interface Process{
		void process(int i);
	}
}
