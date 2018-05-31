package video20.example;

public class A_V_20_THIS_REFERENCE_IN_LAMDA_IN_JAVA_8 {
	public void doProcess(int i, Process p) {
		p.process(i);
	}

	public static void main(String[] args) {
		A_V_20_THIS_REFERENCE_IN_LAMDA_IN_JAVA_8 thisReference =new A_V_20_THIS_REFERENCE_IN_LAMDA_IN_JAVA_8();
		thisReference.doProcess(10, i -> {
			System.out.println("value of i is :: " + i);
			//System.out.println(this);//CTE this is not going to override the reference of top class [this cant be use in static context] 
		});
	}

	interface Process {
		void process(int i);
	}
}
