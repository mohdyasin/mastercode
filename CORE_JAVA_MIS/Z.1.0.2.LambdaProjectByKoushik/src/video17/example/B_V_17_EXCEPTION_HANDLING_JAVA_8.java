package video17.example;

import java.util.function.BiConsumer;

public class B_V_17_EXCEPTION_HANDLING_JAVA_8 {

	public static void main(String[] args) {
		//this is my input 
		int [] someNumbers = {1, 2, 3, 4};
		int key =2; // This key should be sum in all array elemts   
		
		//Output:
		//3, 4, 5, 6 
		System.out.println("Addition of key in all the elements:: ");
		process(someNumbers, key, (i1, i2) -> System.out.println(i1 + i2));
		
		System.out.println("Substractions of key in all the elements:: ");
		process(someNumbers, key, (i1, i2) -> System.out.println(i1 - i2));
		 
		System.out.println("Multiplication of key in all the elements:: ");
		process(someNumbers, key, (i1, i2) -> System.out.println(i1 * i2));
		
		System.out.println("Divistion of key in all the elements:: ");
		process(someNumbers, key, (i1, i2) -> System.out.println(i1 / i2));
	}

	
	private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
		for(int number : someNumbers) {
			consumer.accept(number, key);
		}
		
	}
}
