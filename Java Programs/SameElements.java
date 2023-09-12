import java.util.Scanner;

public class SameElements {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}

		differentElement(ar);
	}

	public static void differentElement(int[] ar) {

		int count = 0, j=0;
		for (int i = 1; i < ar.length; i++) {
			if(ar[j]!=ar[i]) {
				count++;
			}
		}
		System.out.println(count);
	}
}

