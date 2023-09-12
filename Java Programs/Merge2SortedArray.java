import java.util.Scanner;

public class Merge2SortedArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar1 = new int[n];
		for (int i = 0; i < ar1.length; i++) {
			ar1[i]=scan.nextInt();
		}
		int m = scan.nextInt();
		int[] ar2 = new int[m];
		for (int i = 0; i < ar2.length; i++) {
			ar2[i]=scan.nextInt();
		}
		int[] ar3 = new int[n+m];

		mergeArray(ar1,ar2,ar3);

		for (int i = 0; i < ar3.length; i++) {
			System.out.print(ar3[i]+" ");
		}	


	}

	private static void mergeArray(int[] ar1, int[] ar2, int[] ar3) {


		for (int j = 0; j <ar1.length; j++) {
			ar3[j]=ar1[j];
		}

		int z = ar3.length-ar1.length;

		for (int k = 0; k < ar2.length; k++) {
			ar3[z++]=ar2[k];
		}
		
	}

}
