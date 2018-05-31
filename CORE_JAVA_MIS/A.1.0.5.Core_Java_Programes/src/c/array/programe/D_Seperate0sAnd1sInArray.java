package c.array.programe;

public class D_Seperate0sAnd1sInArray {

	// arr[] = {0,1,0,0,1,1,1,0,1}
	// Array after separating odd and even numbers :
	// {0,0,0,0,1,1,1,1,1}
	public static void main(String[] args) {
		int[] array = { 0, 1, 0, 1, 0, 0, 0, 1, 1 };
		//separate0s1sSolution1(array);
		separate0s1sSolution2(array);
		System.out.print("{");
		for (int element : array) {
			System.out.print(element + ",");
		}
		System.out.println("}");
	}

	// First Approach
	public static int[] separate0s1sSolution1(int arr[]) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				count++;
			}
		}
		for (int i = 0; i < count; i++) {
			arr[i] = 0;
		}
		for (int i = count; i < arr.length; i++) {
			arr[i] = 1;
		}
		return arr;
	}

	// Second Approach
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
