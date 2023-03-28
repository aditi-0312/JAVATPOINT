package basicProg;

public class ArmstrongNumber {
	

	public static void main(String[] args) {
		int n = 153;
		System.out.println(checkArmstrong(n));
	}

	private static boolean checkArmstrong(int n) {
		int temp=n;
		int digits = 0;
		while(temp!=0) {
			temp=temp/10;
			digits++;
		}
		
		temp=n;
		int sum=0;
		while(temp>0) {
			double last=temp%10;
			sum+=(int)Math.pow(last, digits);
			temp=temp/10;
		}
		if(sum==n)
		return true;
		else
			return false;
	}

}
