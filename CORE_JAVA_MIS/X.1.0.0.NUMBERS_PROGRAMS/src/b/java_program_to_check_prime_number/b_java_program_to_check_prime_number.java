package b.java_program_to_check_prime_number;

public class b_java_program_to_check_prime_number {
	public static void main(String[] args) {

		System.out.println("17 is prime number?: " + isPrime(17));
		System.out.println("2 is prime number?: " + isPrime(2));
		System.out.println("91 is prime number?: " + isPrime(91));
		System.out.println("29 is prime number?: " + isPrime(29));
		System.out.println("81 is prime number?: " + isPrime(81));
	}

	public static boolean isPrime(int number) {
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

}