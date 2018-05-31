package video17.example;

public class A_V_17_EXCEPTION_HANDLING_JAVA_7 {

	public static void main(String[] args) {
		//this is my input 
		int [] someNumbers = {1, 2, 3, 4};
		int key =2; // This key should be sum in all array elemts   
		
		//Output:
		//3, 4, 5, 6 
		process(someNumbers, key);
	}

	
	private static void process(int[] someNumbers, int key) {
		for(int number : someNumbers) {
			System.out.println(number + key);
		}
		
	}
}
