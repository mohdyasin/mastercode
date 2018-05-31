package h.string.programs;
public class G_PalindromUsingHalfLoopMoving_From_Both_End_of_String_Simultaneously {
	public static void main(String[] args) {
		String str = "madam";
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
