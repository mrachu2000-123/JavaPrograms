import java.util.Scanner;

public class RepeatedElementsArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] ar1 = new int[n];
		
		for (int i = 0; i < ar1.length; i++) {
			ar1[i] = scan.nextInt();
		}

		int m = scan.nextInt();
		int[] ar2 = new int[m];
		
		for (int i = 0; i < ar2.length; i++) {
			ar2[i] = scan.nextInt();
		}
		
//		for (int i = 0; i < ar1.length; i++) {
//			System.out.print(ar1[i]+" ");
//			}
//		
//		for (int i = 0; i < ar2.length; i++) {
//			System.out.print(ar2[i]+" ");
//			}

		repeatedElements(ar1,ar2);
	}

	public static void repeatedElements(int[] ar1, int[] ar2) {

		int i =0, j=0;

		while(i<ar1.length && j<ar2.length) {

			if(ar1[i]==ar2[j]) {
				System.out.print(ar1[i]+" ");
				i++;
				j++;
			}else if(ar2[j]<ar1[i]) {
				j++;
			}else {
				i++;
			}
		}
	}
}
