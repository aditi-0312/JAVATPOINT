package arrayProg;

public class FrequencyOfEachElement {

	public static void main(String[] args) {
		int[] a = { 1, 2, 4, 5, 6, 1, 2, 3 };

		int[] freq = new int[a.length];
		int visited = -1;

		for (int i = 0; i < a.length; i++) {
			int count = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;

					freq[j] = visited;
				}
			}
			if (freq[i] != visited) {
				freq[i] = count;
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (freq[i] != visited) {
				System.out.println(a[i] + " == " + freq[i]);
			}
		}
	}

}
