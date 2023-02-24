package arrayProg;

public class RightRotateElements {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };

		for (int i : a) {
			System.out.print(i + " ");
		}
		
		for(int i=0;i<1;i++) {
			int last=a[a.length-1];
			int j;
			for(j=a.length-1;j>0;j--) {
				a[j]=a[j-1];
			}
			a[j]=last;
		}
		System.out.println();
		for (int i : a) {
			System.out.print(i + " ");
		}
	}

}
