package c.array.programe;
public class C_RemoveDuplicatesInArray_ND {
	public static void main(String[] args) {
		int[] array = { 10, 10, 30, 40, 40 };
		int size = array.length;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (array[i] == array[j]) {
					while (j < (size - 1)) {
						array[j] = array[j + 1];
						j++;
					}
					size--;
				}
			}
		}
		for (int i = 0; i < size; i++) {
			System.out.print(" " + array[i]);
		}
	}
}
