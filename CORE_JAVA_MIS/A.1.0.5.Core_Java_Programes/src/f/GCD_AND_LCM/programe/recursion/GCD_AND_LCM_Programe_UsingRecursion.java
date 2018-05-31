package f.GCD_AND_LCM.programe.recursion;
import java.util.Scanner;
public class GCD_AND_LCM_Programe_UsingRecursion {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number1 = 10;//input.nextInt();
		int number2 = 20; //input.nextInt();
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
