package conversion;

import java.util.Arrays;

public class StringToOthers {

	public static void main(String[] args) {
		String s="32";
		String s1="aditi";
		int i=Integer.parseInt(s);
		int i1=Integer.valueOf(s);
		
		long l=Long.parseLong(s);
		long l1=Long.valueOf(s);
		
		double d=Double.parseDouble(s);
		double d1=Double.valueOf(s);
		
		float f=Float.parseFloat(s);
		float f1=Float.valueOf(s);
		
		char c=s1.charAt(1);
		char[] c1=s1.toCharArray();
		
		System.out.println(c);
		System.out.println(Arrays.toString(c1));
		
		System.out.println(i+i1);
		System.out.println(l1);
		System.out.println(d+d1);
		System.out.println(f);
	}

}
