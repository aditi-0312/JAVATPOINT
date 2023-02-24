package stringProg;

public class StringRotation {

	public static void main(String[] args) {
		String s="abcde";
		String s1="deabc";
		
		 s=s.concat(s);
		 System.out.println(s);
		 if(s.contains(s1))
			 System.out.println("String is a rotation");
		 else
			 System.out.println("String is not a rotation");

	}

}
