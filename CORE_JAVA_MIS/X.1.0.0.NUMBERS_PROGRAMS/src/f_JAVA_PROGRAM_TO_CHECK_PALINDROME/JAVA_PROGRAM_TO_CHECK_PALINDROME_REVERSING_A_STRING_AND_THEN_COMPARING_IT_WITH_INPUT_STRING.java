package f_JAVA_PROGRAM_TO_CHECK_PALINDROME;

import java.util.Scanner;

public class JAVA_PROGRAM_TO_CHECK_PALINDROME_REVERSING_A_STRING_AND_THEN_COMPARING_IT_WITH_INPUT_STRING {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter string : ");

		String str = scanner.nextLine();
		String reverseStr = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reverseStr = reverseStr + str.charAt(i);
		}

		if (str.equals(reverseStr)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
	}
}
