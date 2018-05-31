package h.string.programs;
public class G_PalindromProgramUsingRecurstion {
	public static boolean isPal(String s) {
		if (s.length() == 0 || s.length() == 1)
			return true;
		if (s.charAt(0) == s.charAt(s.length() - 1)){
			System.out.println("String while calling isPal :: " +  s);
			System.out.println("Taking substring while passing :: " +  s.substring(1, s.length() - 1));
			return isPal(s.substring(1, s.length() - 1));
		}
		return false;
	}
	public static void main(String[] args) {
		if (isPal("madam"))
			System.out.println("palindrome");
		else
			System.out.println("not a palindrome");
	}
}
