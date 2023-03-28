package searchingSorting;

import java.util.Arrays;

public class LinearSearch {

	public static void main(String[] args) {
		int a[]= {1,3,2,5,6};
		int key=5;
		
		for(int i=0;i<a.length;i++) {
			if(key==a[i])
				System.out.println("key is present at index: "+i);
		}
		System.out.println(Arrays.toString(a));
	}
}
