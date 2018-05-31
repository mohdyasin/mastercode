package com.binary.serarch;

public class BinarySearch {

	public static void main(String[] args) {
		int index = binarySearch(new int[] { 1, 2, 3, 4, 5 }, 5);
		System.out.println(index);
	}

	public static int binarySearch(int arrayLength[], int searchItem) {
		int start = 0;
		int end = arrayLength.length - 1;
		int mid;
		while (start <= end) {
			mid = (start + end) / 2;
			if (searchItem == arrayLength[mid]) {
				return mid;
			} else if (searchItem < arrayLength[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}
}
