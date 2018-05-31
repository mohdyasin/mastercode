package b.DECIMAL_NUMBER_TO_BINARY_NUMBERS;

import java.util.Scanner;
import java.util.Stack;

public class B_Solution_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// Create Stack object
		Stack<Integer> stack = new Stack<Integer>();
		int num = 10;
		while (num != 0) {
			int d = num % 2;
			stack.push(d);
			num /= 2;
		}

		System.out.print("\nBinary representation is:");
		while (!(stack.isEmpty())) {
			System.out.print(stack.pop());
		}
		System.out.println();
	}
}