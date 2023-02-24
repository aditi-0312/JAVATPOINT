package stringProg;

import java.util.Arrays;

public class FrequencyChars {

	public static void main(String[] args) {
		String str = "aditi is";
		char[] s = str.toCharArray();

		int freq[] = new int[s.length];
		int i;

		for (i = 0; i < s.length; i++) {
			freq[i] = 1;
			for (int j = i + 1; j < s.length; j++) {
				if (s[i] == s[j] && s[i] != ' ') {
					freq[i]++;
					s[j] = '0';
				}
			}
		}
		for(i=0;i<freq.length;i++) {
			if(s[i]!=' '&&s[i]!='0')
				System.out.println(s[i]+ "-"+freq[i]);
		}

	}

}
