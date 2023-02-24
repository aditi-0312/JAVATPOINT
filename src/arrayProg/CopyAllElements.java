package arrayProg;

public class CopyAllElements {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int[] arr1=new int[arr.length];
		//int temp=0;
		
		for(int i=0;i<arr.length;i++) {
			arr1[i]=arr[i];
			//arr1[temp]=arr[i];
			//temp++;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr1[i]);
		}
	}
}
