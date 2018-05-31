package video17.example;

import java.util.function.BiConsumer;

public class C_V_17_EXCEPTION_HANDLING_JAVA_8_ADDING_EXCEPTION_ONE_WAY {

	public static void main(String[] args) {
		//this is my input 
		int [] someNumbers = {1, 2, 3, 4};
		int key =0; // This key should be sum in all array elemts   
		
		System.out.println("Divistion of key in all the elements:: ");
		process(someNumbers, key, (i1, i2) -> System.out.println(i1 / i2));
	}

	
	private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
		for(int number : someNumbers) {
			try {
				consumer.accept(number, key);
			}catch(ArithmeticException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}
		
	}
}
