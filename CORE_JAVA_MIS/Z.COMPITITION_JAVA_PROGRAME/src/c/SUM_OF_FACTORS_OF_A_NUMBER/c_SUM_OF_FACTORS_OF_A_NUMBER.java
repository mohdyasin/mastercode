package c.SUM_OF_FACTORS_OF_A_NUMBER;

public class c_SUM_OF_FACTORS_OF_A_NUMBER {
	public static void main(String[] args) {
		int n = 10;
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println("factors of " + n + " is "  + i);
				sum = sum + i;
			}
		}
		System.out.println("Sum of factors : " + sum);
	}
}
