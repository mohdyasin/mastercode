package b.sumofdigits.program.recursion.and.nonrecursion;

public class SumOfDigits {
	public static void main(String[] args) {
		System.out.println(sumOfNumber(123456789));
	}

	static int sumOfNumber(int number) {
		int sum = 0;
		int count = 0 ;
		while (number > 0) {			//	123 > 0		//	12 > 0		//	1 > 0	// 0 > 0 exit
			sum = sum + number % 10;	//	0 + 3		//	3 + 2		//	5 + 1
			number = number / 10;		//	12			//	1			//	0
			count++;
		}
		//System.out.println(count);
		return sum;
	}

}
