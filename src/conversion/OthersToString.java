package conversion;

public class OthersToString {

	public static void main(String[] args) {
		int i = 9;
		double d = 23.9;
		float f = 12;
		long l = 43;
		
		String s=String.valueOf(i);
		String s1=String.valueOf(d);
		String s2=String.valueOf(f);
		String s3=String.valueOf(l);
		
		System.out.println(s+" "+s1+" "+s2+" "+s3);

	}

}
