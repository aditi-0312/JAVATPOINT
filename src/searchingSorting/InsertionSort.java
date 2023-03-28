package searchingSorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] a = { 5, 1, 6, 2, 4, 3 };

		insSort(a);
		System.out.println(Arrays.toString(a));

	}

	private static void insSort(int[] a) {
		int temp, j;
		for (int i = 1; i < a.length; i++) {
			temp = a[i];
			j = i;
			while (j > 0 && a[j - 1] > temp) {
				a[j] = a[j - 1];
				j = j - 1;
			}
			a[j] = temp;
		}
	}

}
