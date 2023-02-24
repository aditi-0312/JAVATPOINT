package stringProg;

public class DuplicateCharacters {

	public static void main(String[] args) {
		String s="my name is aditi";
		char[] str=s.toCharArray();
		
		for(int i=0;i<str.length;i++) {
			int count=1;
			for(int j=i+1;j<str.length;j++) {
				if(str[i]==str[j] && str[i]!=' ' && str[i]!='0') {
					
					count++;
					str[j]='0';
					
				}
			}
				if(count>1 && str[i]!='0') {
				System.out.println(str[i]);
			}
		}
		
	}

}
