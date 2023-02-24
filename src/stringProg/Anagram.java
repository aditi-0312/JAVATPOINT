package stringProg;

import java.util.Arrays;

public class Anagram {

	static String s = "Brag";
	static String s1 = "grab";

	public static void main(String[] args) {

		s = s.toLowerCase();
		s1 = s1.toLowerCase();


		if (s.length() != s1.length()) {
			System.out.println("not anagram");
		} else {
			char[] s2 = s.toCharArray();
			char[] s3 = s1.toCharArray();

			Arrays.sort(s2);
			Arrays.sort(s3);

			if (Arrays.equals(s2, s3))
				System.out.println("anagram");
			else
				System.out.println("not anagram");
		}

	}

}
