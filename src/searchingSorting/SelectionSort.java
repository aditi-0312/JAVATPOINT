package searchingSorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int a[]= {2,6,4,1,9,3};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				int minIndex=i;
				if(a[j]<a[minIndex]) {
					int temp=a[j];
					a[j]=a[minIndex];
					a[minIndex]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
