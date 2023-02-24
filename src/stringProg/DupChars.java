package stringProg;

public class DupChars {

	public static void main(String[] args) {
		String s="mississippi";
		int count;
		
		char str[]=s.toCharArray();
		
		System.out.println("duplicate characters in a given string: ");
		
		for(int i=0;i<s.length();i++) {
			count=1;
			for(int j=i+1;j<s.length();j++) {
				if(str[i]==str[j] && str[i]!=' ') {
					count++;
					
					str[j]='0';
				}
			}
			
			if(count>1 && str[i]!='0')
				System.out.println(str[i]);
		}

	}

}
