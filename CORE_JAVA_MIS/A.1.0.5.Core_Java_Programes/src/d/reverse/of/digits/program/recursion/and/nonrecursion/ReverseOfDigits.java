package d.reverse.of.digits.program.recursion.and.nonrecursion;
public class ReverseOfDigits {
	public static void main(String[] args) {
		System.out.println(reverseOfNumber(123));
	}
	static int reverseOfNumber(int number) {
		int reverse = 0;
		while (number > 0) {						// 123 > 0 		//	12 > 0		//	1 > 0		//0 > 0 exit
			reverse = reverse * 10 + number % 10;	// 0*10 + 3		//	3*10 + 2	// 32 *10 + 1
			number = number / 10;					// 12			//  1			// 0
		}
		return reverse;
	}
}
