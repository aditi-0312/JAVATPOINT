package searchingSorting;

import java.util.Arrays;

public class BinSearchRecursion {

	public static void main(String[] args) {
		int[] arr= {4,1,2,7,9};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int l=0;
		int h=arr.length-1;
		int key=7;
		
		int index = binSearch(arr,l,h,key);
		System.out.println(index);
	}

	private static int binSearch(int[] arr, int l, int h, int key) {
		if(l>h)
			return -1;
		else
		{
			int mid=(l+h)/2;
			if(key==arr[mid]) {
				return mid;
			}
			else if(key>arr[mid]) {
				return binSearch(arr,l=mid+1,h,key);
			}
			else
				return binSearch(arr,l,h=mid-1,key);	
		}
	}

}
