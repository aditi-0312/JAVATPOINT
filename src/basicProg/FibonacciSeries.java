package basicProg;

import java.util.Scanner;

public class FibonacciSeries {

	private static int fib(int n) {
		if (n == 0 || n == 1) 
			return n;
		
			return fib(n - 1) + fib(n - 2);
	}

	public static void main(String[] args) {
		
		  System.out.print("enter the fibonacci number : ");
		  Scanner sc = new Scanner(System.in); 
		  int n=sc.nextInt(); 
		  int result =fib(n);
		  
		  System.out.println("fibonacci value for given number is = "+result);
		 
		
		//System.out.println(fib(5));
		
		/*
		 * int a = 0; int b = 1; int c;
		 * 
		 * System.out.print(a + " " + b);
		 * 
		 * for (int i = 2; i < 10; i++) { c = a + b; System.out.print(" " + c); a = b; b
		 * = c; }
		 */

	}

}
