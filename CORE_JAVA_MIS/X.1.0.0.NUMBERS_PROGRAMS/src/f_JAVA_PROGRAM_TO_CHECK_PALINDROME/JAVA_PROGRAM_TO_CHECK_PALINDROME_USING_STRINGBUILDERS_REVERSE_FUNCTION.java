package f_JAVA_PROGRAM_TO_CHECK_PALINDROME;

import java.util.Scanner;

public class JAVA_PROGRAM_TO_CHECK_PALINDROME_USING_STRINGBUILDERS_REVERSE_FUNCTION {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter string : ");

		String str = scanner.nextLine();
		StringBuilder strBuilder = new StringBuilder(str);

		strBuilder.reverse();

		if (str.equals(strBuilder.toString())) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}

	}

}