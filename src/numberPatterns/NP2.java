package numberPatterns;

public class NP2 {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			int p = 1;
			for (int j = i; j <= n; j++) {
				System.out.print(p++ + " ");
			}
			System.out.println();
		}
	}
}
