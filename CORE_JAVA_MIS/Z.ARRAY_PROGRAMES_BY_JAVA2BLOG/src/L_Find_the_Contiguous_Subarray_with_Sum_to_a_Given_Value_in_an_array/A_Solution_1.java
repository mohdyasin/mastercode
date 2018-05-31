package L_Find_the_Contiguous_Subarray_with_Sum_to_a_Given_Value_in_an_array;
public class A_Solution_1 {
	public static void main(String[] args) {
		int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
		findSubArraySumEqualToX(arr, 33);
	}
	static void findSubArraySumEqualToX(int arr[], int X) {
		int currentSum;
		for (int i = 0; i < arr.length; i++) {
			currentSum = arr[i];
			// try all subarrays starting with 'i'
			for (int j = i + 1; j <= arr.length; j++) {
				if (currentSum == X) {
					int endIndexForContArray = j - 1;
					System.out.println("Sum found between indexes " + i + " and " + endIndexForContArray);
					for (int k = i; k <= endIndexForContArray; k++) {
						System.out.print(arr[k] + " ");
					}
					return;
				}
				if (currentSum > X || j == arr.length)
					break;
				currentSum = currentSum + arr[j];
			}
		}
		System.out.println("No subarray found");
		return;
	}
}
