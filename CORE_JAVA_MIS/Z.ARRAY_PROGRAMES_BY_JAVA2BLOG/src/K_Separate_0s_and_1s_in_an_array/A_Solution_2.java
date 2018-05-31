package K_Separate_0s_and_1s_in_an_array;
public class A_Solution_2 {
	public static void main(String[] args) {
		int arr[] = { 0, 1, 0, 0, 1, 1, 1, 0, 1 };
		System.out.println("Original Array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		arr = separate0s1sSolution2(arr);
		System.out.println();
		System.out.println("nArray after separating 0's and 1's : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static int[] separate0s1sSolution2(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int left = 0;
			int right = arr.length - 1;
			while (arr[left] == 0) {
				left++;
			}
			while (arr[right] == 1) {
				right--;
			}
			if (left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		}
		return arr;
	}

}
