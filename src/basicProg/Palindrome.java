package basicProg;

public class Palindrome {

	public static void main(String[] args) {
		int n = 121;
		// System.out.print(palindromeNum(n));
		/*
		 * int result=palNum(n, 0); if(result==n) System.out.println("true"); else
		 * System.out.println("false");
		 */

		String s = "kayak";
		char[] str = s.toCharArray();
		int len = str.length - 1;
		String rev = "";
		// String res = palWord(s);
		/*
		 * if (s.equals(palWord(s))) System.out.println("true"); else
		 * System.out.println("false");
		 */
		// System.out.println(palWordRecursion(str, len,rev));
		if (s.equals(palWordRecursion(str, len, rev)))
			System.out.println("true");
		else
			System.out.println("false");
	}

	private static String palWordRecursion(char[] str, int len, String rev) {

		if (len < 0)
			return rev;
		else {
			rev = rev + str[len];
			return palWordRecursion(str, len - 1, rev);
		}
	}

	private static String palWord(String s) {
		char[] str = s.toCharArray();
		String rev = "";
		for (int i = str.length - 1; i >= 0; i--) {
			rev = rev + str[i];
		}
		return rev;
	}

	private static int palNum(int n, int s) {
		int tmp = n;
		// int s = 0;
		if (n <= 0) {
			return s;
		} else {
			int d = n % 10;
			s = (s * 10) + d;
			return palNum(n / 10, s);
		}
	}

	private static boolean palindromeNum(int n) {
		int temp = n;
		int sum = 0;

		while (n > 0) {
			int r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum)
			return true;

		return false;
	}

}
