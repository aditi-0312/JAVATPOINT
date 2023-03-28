package NumberPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class GCD {

	public static void main(String[] args) {
		ArrayList<Integer> f1=new ArrayList<>();
		ArrayList<Integer> f2=new ArrayList<>();

		int a=12;
		int b=4;
		
		for(int i=1;i<=a;i++) {
			if(a%i==0)
				f1.add(i);
		}
		System.out.println(f1);

		for(int i=1;i<=b;i++) {
			if(b%i==0)
				f2.add(i);
		}
		System.out.println(f2);
		
		f1.retainAll(f2);
		System.out.println("Common elements = "+f1);
		System.out.println("The GCD is = " +Collections.max(f1));
	}

}
