package basicProg;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.print("enter the number= ");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int flag=0;
		
		for(int i=2;i<num/2;i++) {
			if(num%i==0)
				flag=1;
		}
		
		if(flag==0)
			System.out.println("prime");
		else
			System.out.println("not prime");
	}

}
