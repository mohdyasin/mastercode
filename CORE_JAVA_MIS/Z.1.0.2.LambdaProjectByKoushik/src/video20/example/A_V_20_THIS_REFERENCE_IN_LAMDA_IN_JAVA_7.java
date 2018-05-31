package video20.example;

public class A_V_20_THIS_REFERENCE_IN_LAMDA_IN_JAVA_7 {
	public void doProcess(int i, Process p) {
		p.process(i);
	}

	public static void main(String[] args) {
		A_V_20_THIS_REFERENCE_IN_LAMDA_IN_JAVA_7 thisReference =new A_V_20_THIS_REFERENCE_IN_LAMDA_IN_JAVA_7();
		thisReference.doProcess(10, new Process() {

			@Override
			public void process(int i) {
				System.out.println("Value of i is :: " + i);
				System.out.println(this);
			}
			
			public String toString() {
				return "This is the anonymous inner class";
			}
			
		});
	}

	interface Process {
		void process(int i);
	}
}
