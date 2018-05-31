package a.How_to_swap_two_numbers_without_using_temporary_variables_in_java;

public class A_How_to_swap_two_numbers_without_using_temporary_variables_in_java {
	public static void main(String args[]) {
		int a = 5;
		int b = 10;

		// First way
		System.out.println("First way");
		System.out.println("Before swap:");
		System.out.println("a value: " + a);
		System.out.println("b value: " + b);

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swap:");
		System.out.println("a value: " + a);
		System.out.println("b value: " + b);

		// Second way
		System.out.println("****************");
		System.out.println("Second way");
		System.out.println("Before swap:");
		System.out.println("a value: " + a);
		System.out.println("b value: " + b);

		a = a * b;
		b = a / b;
		a = a / b;

		System.out.println("After swap:");
		System.out.println("a value: " + a);
		System.out.println("b value: " + b);

		// Third way
		System.out.println("****************");
		System.out.println("Third way");
		System.out.println("Before swap:");
		System.out.println("a value: " + a);
		System.out.println("b value: " + b);

		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("After swap:");
		System.out.println("a value: " + a);
		System.out.println("b value: " + b);
	}
}