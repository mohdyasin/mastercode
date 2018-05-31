package F_Given_a_sorted_array_and_a_number_x_find_the_pair_in_array_whose_sum_is_closest_to_x;
public class A_Solution_1 {
	public static void main(String[] args) {
		int array[] = { -40, -5, 1, 3, 6, 7, 8, 20 };
		findPairWithClosestToXBruteForce(array, 5);
	}
	public static void findPairWithClosestToXBruteForce(int arr[], int X) {
		if (arr.length < 2)
			return;
		// Suppose 1st two element has minimum diff with X
		int minimumDiff = Math.abs(arr[0] + arr[1] - X);
		int pair1stIndex = 0;
		int pair2ndIndex = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int tempDiff = Math.abs(arr[i] + arr[j] - X);

				if (tempDiff < minimumDiff) {
					pair1stIndex = i;
					pair2ndIndex = j;
					minimumDiff = tempDiff;
				}
			}
		}
		System.out.println(" The pair whose sum is closest to X using brute force method: " 
		+ arr[pair1stIndex] + " " + arr[pair2ndIndex]);
	}
}
