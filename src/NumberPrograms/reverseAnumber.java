package NumberPrograms;

public class reverseAnumber {
	static int rev(int n) {
		int rev = 0;
		int num;
		while(n!=0) {
		num=n;
		rev=rev*10+num%10;
		n=num/10;
		}
		return rev;
		
	}

	
	public static void main(String[] args) {
		System.out.println(rev(8970));

	}

}
