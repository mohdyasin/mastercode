package h.string.programs;

import java.util.LinkedList;
import java.util.Queue;

public class G_PalindromProgramUsingQueue {

	public static void main(String[] args) {

		String input = "madam";
		Queue<Character> queue = new LinkedList<Character>();

		for (int i = input.length() - 1; i >= 0; i--) {
			queue.add(input.charAt(i));
		}

		String reverseString = "";

		while (!queue.isEmpty()) {
			reverseString = reverseString + queue.remove();
		}
		if (input.equals(reverseString))
			System.out.println("The input String is a palindrome.");
		else
			System.out.println("The input String is not a palindrome.");

	}

}
