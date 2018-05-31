package video20.example;

public class A_V_20_THIS_REFERENCE_IN_LAMDA_IN_JAVA_9_THIRD {
	public void doProcess(int i, Process p) {
		p.process(i);
	}

	public void execute() {
		doProcess(10, i->{
			System.out.println("value of i is :: " +  i);
			System.out.println(this);
		});
	}
	
	public static void main(String[] args) {
		A_V_20_THIS_REFERENCE_IN_LAMDA_IN_JAVA_9_THIRD thisReference =new A_V_20_THIS_REFERENCE_IN_LAMDA_IN_JAVA_9_THIRD();
		thisReference.execute();
	}

	interface Process {
		void process(int i);
	}
	
	public String toString() {
		return "This is the main A_V_20_THIS_REFERENCE_IN_LAMDA_IN_JAVA_9_THIRD";
	}
}
