package basicProg;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(fact(3));
	}

	private static int fact(int n) {
		if (n <= 1)
			return n;
		else
			return n * fact(n - 1);
	}

}