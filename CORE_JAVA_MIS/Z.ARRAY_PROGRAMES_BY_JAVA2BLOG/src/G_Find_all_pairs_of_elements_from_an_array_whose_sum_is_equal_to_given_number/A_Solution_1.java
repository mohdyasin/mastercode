package G_Find_all_pairs_of_elements_from_an_array_whose_sum_is_equal_to_given_number;

public class A_Solution_1 {
	public static void main(String[] args) {
		int array[] = { -40, -5, 1, 3, 6, 7, 8, 20 };
		findPairsWithSumEqualsToXBruteForce(array, 15);
	}

	public static void findPairsWithSumEqualsToXBruteForce(int arr[], int X) {
		if (arr.length < 2)
			return;

		System.out.println("The pair whose sum is equal to 15 using brute force method: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int tempSum = arr[i] + arr[j];

				if (tempSum == X) {
					System.out.println(arr[i] + " " + arr[j]);
				}
			}
		}
	}
}
