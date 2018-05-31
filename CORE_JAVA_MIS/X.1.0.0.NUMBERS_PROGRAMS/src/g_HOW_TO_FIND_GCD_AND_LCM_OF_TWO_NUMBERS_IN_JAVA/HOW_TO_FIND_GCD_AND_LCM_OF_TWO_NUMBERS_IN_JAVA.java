package g_HOW_TO_FIND_GCD_AND_LCM_OF_TWO_NUMBERS_IN_JAVA;

import java.util.Scanner;

/**
 * In this post, we will see how to find Greatest common divisor(GCD) and Least
 * Common Multiple(LCM) in java. GCD is calculated using Euclidean algorithm and
 * LCM is calculated using reduction by GCD Eucid algo for calculating GCD is:
 * Lets say , there are two numbers , a and b so GCD of two numbers = GCD
 * (b,a%b) and GCD(a,0)=a
 * 
 * LCM can be calculated using reduction by GCD : LCM of two numbers a and b = a
 * * b/GCD(a,b)
 */
public class HOW_TO_FIND_GCD_AND_LCM_OF_TWO_NUMBERS_IN_JAVA {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the two numbers: ");

		int number1 = input.nextInt();
		int number2 = input.nextInt();

		System.out.println("The GCD of two numbers is: " + gcd(number1, number2));
		System.out.println("The LCM of two numbers is: " + lcm(number1, number2));

		input.close();

	}

	// Using Eucid algorithm for calculating gcd
	public static int gcd(int a, int b) {
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}

	public static int lcm(int a, int b) {
		return a * b / (gcd(a, b));
	}

}