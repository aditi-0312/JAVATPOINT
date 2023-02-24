package stringProg;

public class NequalParts {

	public static void main(String[] args) {
		String s="aabbcc";
		int n=3;
		String[] parts=new String[n];
		int temp=0;
		int Char=s.length()/n;
		
		for(int i=0;i<s.length();i=i+Char) {
			String part=s.substring(i,i+Char);
			parts[temp]=part;
			temp++;
		}

		for(int i=0;i<parts.length;i++) {
			System.out.println(parts[i]);
		}
		
	}

}
