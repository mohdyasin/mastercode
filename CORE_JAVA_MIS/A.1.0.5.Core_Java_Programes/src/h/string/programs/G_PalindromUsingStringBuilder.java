package h.string.programs;

import java.util.Scanner;

public class G_PalindromUsingStringBuilder {

	public static void main(String[] args) {

		String str = "madam";
		StringBuilder strBuilder = new StringBuilder(str);

		strBuilder.reverse();

		if (str.equals(strBuilder.toString())) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}

	}
}
