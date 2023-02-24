package stringProg;

public class AllSubsets {

	public static void main(String[] args) {
		String s="fun";
		int n=s.length();
		int len=n*(n+1)/2;

		int temp=0;
		String[] ss=new String[len];
		
		for(int i=0;i<s.length();i++) {
			for(int j=i;j<s.length();j++) {
				ss[temp]=s.substring(i,j+1);
				temp++;
			}
		}
		
		for(int i=0;i<ss.length;i++) {
			System.out.print(ss[i]+" ");
		}
	}

}
