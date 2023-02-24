package stringProg;

import java.util.Arrays;

public class MaxMinOccurChar {

	public static void main(String[] args) {
		String str = "she sells sea shells";
		char[] s = str.toCharArray();

		int freq[] = new int[s.length];

		for (int i = 0; i < s.length; i++) {
			freq[i]=1;
			for (int j = i + 1; j < s.length; j++) {
				if (s[i] == s[j] && s[i] != ' ' && s[i] != '0') {
					freq[i]++;
					
					freq[j]='0';
				}
			}
		}

		System.out.println(Arrays.toString(freq));
		
		int min,max;
		min=max=freq[0];
		char minChar=s[0];
		char maxChar=s[0];
		
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>max&&freq[i]!='0') {
				max=freq[i];
				
				maxChar=s[i];
			}
		
			if(freq[i]<min&&freq[i]!='0') {
				min=freq[i];
				
				minChar=s[i];
			}
		}
		System.out.println("minimum repeated character "+min+" times is: "+minChar);
		System.out.println("maximum repeated character "+max+" times is: "+maxChar);

		
	}

}
