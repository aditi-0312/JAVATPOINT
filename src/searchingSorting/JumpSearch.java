package searchingSorting;

public class JumpSearch {

	public static void main(String[] args) {
		int a[] = { 1, 4, 7, 9, 12, 14, 17, 19, 21 };
		int target = 4;
		int result = jumpSearch(a, target);
		System.out.println(result);
	}

	private static int jumpSearch(int[] a, int target) {
		int bs = (int) Math.sqrt(a.length); // Block Size

		int s = 0;
		int l = bs - 1;

		while (a.length != 0) {

			if (target > a[l]) {
				s = l;
				l = l + bs;
			} else {
				for (int i = s; i < l; i++) {
					if (target == a[i])
						return i;
				}
			}
		}
		return -1;
	}

}
