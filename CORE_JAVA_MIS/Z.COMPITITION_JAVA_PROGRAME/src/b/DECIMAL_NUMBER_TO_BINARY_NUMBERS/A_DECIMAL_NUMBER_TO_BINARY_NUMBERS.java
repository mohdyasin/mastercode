package b.DECIMAL_NUMBER_TO_BINARY_NUMBERS;

public class A_DECIMAL_NUMBER_TO_BINARY_NUMBERS {

	public static void main(String[] args) {
		printBinaryFormat(10);
	}

	static void printBinaryFormat(int number) {
		int binary[] = new int[25];
		int index = 0;
		while (number > 0) {
			binary[index++] = number % 2;
			number = number / 2;
		}

		for (int i = index - 1; i >= 0; i--) {
			System.out.print(binary[i]);
		}
	}
}
