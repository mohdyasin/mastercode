package video18.example;

import java.util.function.BiConsumer;

public class A_HandlingException {
	public static void main(String[] args) {
		// this is my input
		int[] someNumbers = { 1, 2, 3, 4 };
		int key = 0; // This key should be sum in all array elemts

		System.out.println("Divistion of key in all the elements:: ");
		process(someNumbers, key, wrapLambda((i1, i2) -> System.out.println(i1 / i2)));

	}

	private static BiConsumer<Integer, Integer> wrapLambda(BiConsumer<Integer, Integer> consumer) {
		return (v, k) -> {
			try {
				consumer.accept(v, k);
			} catch (ArithmeticException e) {
				System.out.println("Exception caught in wrapper lambda");
				e.printStackTrace(); 
			}
		};
	}

	private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
		for (int number : someNumbers) {
			consumer.accept(number, key);
		}

	}

}
