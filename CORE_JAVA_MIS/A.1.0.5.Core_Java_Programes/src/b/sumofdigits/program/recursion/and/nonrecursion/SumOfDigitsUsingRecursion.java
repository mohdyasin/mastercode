package b.sumofdigits.program.recursion.and.nonrecursion;
public class SumOfDigitsUsingRecursion {
	int sum = 0;
	public static void main(String[] args) {
		SumOfDigitsUsingRecursion obj = new SumOfDigitsUsingRecursion();
		int input = 123;
		int a = obj.add(input);
		System.out.println("Sum:" + a);
	}
	int add(int n) {
		sum = n % 10;
		System.out.println("sum :: " + sum);
		if (n == 0) {
			return 0;
		} else {
			return sum + add(n / 10);// 3+add(12) // 2+add(1) // 1+add(0x)
		}
	}
}
