import java.util.Iterator;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];

		for (int i = 0; i < ar.length; i++) {
			ar[i]=scan.nextInt();
		}
		int k= scan.nextInt();

		linSearch(ar,k);
	}

	static void linSearch(int[] ar, int k) {

		for (int i = 0; i < ar.length; i++) {
			if(ar[i]==k) {
				System.out.println(ar[i]+" - present in index - "+i);
			}
		}
	}

}
