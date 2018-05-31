package f_JAVA_PROGRAM_TO_CHECK_PALINDROME;

import java.util.Scanner;

public class JAVA_PROGRAM_TO_CHECK_PALINDROME_USING_HALF_LOOP_MOVING_FROM_BOTH_END_OF_STRING_SIMULTANEOUSLY {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string : ");

		String str = scanner.nextLine();
		boolean isPalin = isPalindrome(str);
		if (isPalin)
			System.out.println("String is Palindrome");
		else
			System.out.println("String is not Palindrome");

	}

	static boolean isPalindrome(String str) {
		for (int i = 0, j = str.length() - 1; i < str.length() / 2; i++, j--) {

			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}

		}
		return true;
	}

}