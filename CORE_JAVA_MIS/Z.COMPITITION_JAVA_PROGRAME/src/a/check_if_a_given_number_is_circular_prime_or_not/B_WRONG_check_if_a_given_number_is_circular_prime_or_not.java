package a.check_if_a_given_number_is_circular_prime_or_not;
public class B_WRONG_check_if_a_given_number_is_circular_prime_or_not {
	// Function to check if a number is prime or not.
	static boolean isPrime(int n) {
		// Corner cases
		if (n <= 1)
			return false;
		if (n <= 3)
			return true;
		// This is checked so that we can skip
		// middle five numbers in below loop
		if (n % 2 == 0 || n % 3 == 0)
			return false;

		for (int i = 5; i * i <= n; i = i + 6)
			if (n % i == 0 || n % (i + 2) == 0)
				return false;

		return true;
	}
	static int cycleNum(int n) {
		String s = Integer.toString(n);
		String p = s.substring(1) + s.charAt(0);
		int a = Integer.parseInt(p);
		return a;
	}
	static void isCircularPrime(int n) {
		int a = n;
		do {
			System.out.println(a);
			if(isPrime(a) == false) {
				System.out.println(n + " IS NOT A CIRCULAR PRIME");
				break;
			}
			a= cycleNum(a);
		}while(a!=n);
		System.out.println(n + " IS A CIRCULAR PRIME");
	}
	public static void main(String[] args) {
		isCircularPrime(10);
	}
}
