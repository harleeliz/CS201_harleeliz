package Part_II;
/* Lab Exercises No.7
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos*/

import java.util.*;

public class SortTest {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		// Prompt the user to select the sorting algorithm
		System.out.println("Select a sorting algorithm:");
		System.out.println("1. Insertion Sort");
		System.out.println("2. Binary Insertion Sort");

		int sortType = in.nextInt();  // 1 for insertionSort, 2 for binaryInsertionSort
		Random r = new Random(123456789);
		int[] data = new int[1000];

		for (int k = 0; k < data.length; k++) {
			data[k] = r.nextInt(200001) - 100000;   // random int range -100000 to 100000
		}

		System.out.println("Original Array:");
		printArray(data);

		if (sortType == 1) {
			insertionSort(data);
			System.out.println("Array after Insertion Sort:");
			printArray(data);
			if (checkSort(data)) {
				System.out.println("Insertion Sort OK");
			} else {
				System.out.println("Insertion Sort NOT OK");
			}
		} else {
			binaryInsertionSort(data);
			System.out.println("Array after Binary Insertion Sort:");
			printArray(data);
			if (checkSort(data)) {
				System.out.println("Binary Insertion Sort OK");
			} else {
				System.out.println("Binary Insertion Sort NOT OK");
			}
		}
	}

	public static boolean checkSort(int[] data) {
		for (int i = 0; i < data.length - 1; i++) {
			if (data[i] > data[i + 1]) {
				System.out.println("data[" + i + "]=" + data[i] + " out of order with data[" + (i + 1) + "]=" + data[i + 1]);
				return false;
			}
		}
		return true;
	}

	public static void insertionSort(int[] data) {
		for (int j = 1; j < data.length; j++) {
			int key = data[j];
			int i = j - 1;

			while (i >= 0 && data[i] > key) {
				data[i + 1] = data[i];
				i--;
			}

			data[i + 1] = key;
		}
	}

	public static void binaryInsertionSort(int[] data) {
		for (int j = 1; j < data.length; j++) {
			int key = data[j];
			int low = 0;
			int high = j - 1;

			while (low <= high) {
				int mid = (low + high) / 2;

				if (key < data[mid]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			}

			for (int i = j - 1; i >= low; i--) {
				data[i + 1] = data[i];
			}

			data[low] = key;
		}
	}

	public static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
