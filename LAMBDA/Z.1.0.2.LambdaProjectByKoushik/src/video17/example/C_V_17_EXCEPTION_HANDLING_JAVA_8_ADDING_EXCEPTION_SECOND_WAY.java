package video17.example;

import java.util.function.BiConsumer;

public class C_V_17_EXCEPTION_HANDLING_JAVA_8_ADDING_EXCEPTION_SECOND_WAY {

	public static void main(String[] args) {
		//this is my input 
		int [] someNumbers = {1, 2, 3, 4};
		int key =0; // This key should be sum in all array elemts   
		
		System.out.println("Divistion of key in all the elements:: ");
		process(someNumbers, key, (i1, i2) -> {
			try {
				System.out.println(i1 / i2);
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		});
	}

	
	private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
		for(int number : someNumbers) {
			consumer.accept(number, key);
		}
		
	}
}
