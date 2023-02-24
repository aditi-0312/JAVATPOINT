package arrayProg;

public class LeftRotateElements {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println();

		for (int i = 0; i < 1; i++) {
			int first;
			int j;
			first = a[0];
			for (j = 0; j < a.length - 1; j++) {
				a[j] = a[j + 1];

			}
			a[j] = first;
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
