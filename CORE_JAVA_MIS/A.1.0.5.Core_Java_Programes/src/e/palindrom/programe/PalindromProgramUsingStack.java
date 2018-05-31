package e.palindrom.programe;
import java.util.Stack;
public class PalindromProgramUsingStack {
	public static void main(String[] args) {
		String input = "madam";
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < input.length(); i++) {
			stack.push(input.charAt(i));
		}
		String reverseString = "";
		while (!stack.isEmpty()) {
			reverseString = reverseString + stack.pop();
		}
		if (input.equals(reverseString))
			System.out.println("The input String is a palindrome.");
		else
			System.out.println("The input String is not a palindrome.");
	}
}
