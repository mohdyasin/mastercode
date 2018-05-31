package G_Find_all_pairs_of_elements_from_an_array_whose_sum_is_equal_to_given_number;

import java.util.HashMap;

public class C_Solution_3 {
	public static void main(String[] args) {
		int array[] = { -40, -5, 1, 3, 6, 7, 8, 20 };
		findPairsEqualsToXUsingHashing(array, 15);
	}
	public static void findPairsEqualsToXUsingHashing(int arr[], int X) {
		HashMap<Integer, Integer> elementIndexMap = new HashMap<Integer, Integer>();
		System.out.println("The pair whose sum is equal to 15 : ");
		for (int i = 0; i < arr.length; i++) {
			elementIndexMap.put(arr[i], i);
		}
		for (int i = 0; i < arr.length; i++) {
			// we have used elementIndexMap.get(X-arr[i])!=i to avoid using same
			// element twice
			if (elementIndexMap.get(X - arr[i]) != null && elementIndexMap.get(X - arr[i]) != i) //
			{
				System.out.println(arr[i] + " " + (X - arr[i]));
			}
		}
	}
}
