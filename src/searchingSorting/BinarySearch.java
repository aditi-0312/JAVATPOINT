package searchingSorting;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr= {3,4,1,8,9,0};
		int key=8;
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(binSearch(arr,key));
	}

	private static int binSearch(int[] arr,int key) {
		int li=0;
		int hi=arr.length-1;
		int mid=(li+hi)/2;
		
		while(li<=hi) {
			if(arr[mid]==key) {
				break;
			}
			else if(arr[mid]<key)
				li=mid+1;
			else if(arr[mid]>key)
				hi=mid-1;
			
			mid=(li+hi)/2;
		}
		return mid;
		
	}

}
