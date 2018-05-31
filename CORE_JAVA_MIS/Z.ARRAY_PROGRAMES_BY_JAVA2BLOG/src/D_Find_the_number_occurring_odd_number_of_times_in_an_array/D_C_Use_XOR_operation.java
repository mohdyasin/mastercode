package D_Find_the_number_occurring_odd_number_of_times_in_an_array;

public class D_C_Use_XOR_operation {
	public static void main(String[] args) {
		int array[] = new int[] { 20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20 };
		System.out.println("Number which occurs odd number of times is : " + getOddTimesElement(array));
	}

	static int getOddTimesElement(int ar[]) {
		;
		int result = 0;
		for (int i  = 0; i < ar.length; i++) {
			result = result ^ ar[i];
			System.out.println("result :: " + result);
		}
		System.out.println("result while returning :: " + result);
		return result;
	}
}
