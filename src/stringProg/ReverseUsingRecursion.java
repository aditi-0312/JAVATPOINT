package stringProg;

public class ReverseUsingRecursion {

	public static void main(String[] args) {
		String s="study late";
		reverse(s);
	}

	private static void reverse(String s) {
		if((s==null)||(s.length()<1))
			return;
		else 
			System.out.print(s.charAt(s.length()-1));
			reverse(s.substring(0,s.length()-1));
	}
}
