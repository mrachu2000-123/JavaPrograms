import java.util.Scanner;

public class LeftRotation {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}

		int k = scan.nextInt();  //rotation count
		
		LeftRotation.leftRotation(ar,k);

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}

	}

	public static void leftRotation(int[] ar, int k) {

		for(int x = 0;x<k;x++) {
			int temp = 0 ;
			temp = ar[0];
			for (int i = 0; i < ar.length-1; i++) {
				ar[i]=ar[i+1];
			}
			ar[ar.length-1] = temp;
		}
	}
}

