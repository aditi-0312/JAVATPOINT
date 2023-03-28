package searchingSorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int a[] = { 2, 6, 4, 1, 9, 3 };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j + 1] > a[j]) {
					int temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
