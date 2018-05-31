package d.reverse.of.digits.program.recursion.and.nonrecursion;
public class ReverseOfDigitsUsingRecursion {
	public static void reverseMethod(int number) {
		if (number < 10) {
			System.out.println(number);
			return;
		} else {
			System.out.print(number % 10);
			reverseMethod(number / 10);
		}
	}
	public static void main(String args[]) {
		reverseMethod(123456);
		System.out.println();
	}
}
