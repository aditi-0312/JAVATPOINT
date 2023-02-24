package arrayProg;

public class DuplicateElements {

	public static void main(String[] args) {

		int[] a= {1,4,3,5,4,3,2,1};
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[j]);
				}
			}
		}
		
	}

}
