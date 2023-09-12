import java.util.Scanner;

public class SubarrayDiff {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		
		for (int i = 0; i < ar.length; i++) {
			ar[i]=scan.nextInt();
		}
		int k = scan.nextInt();
		
		subarraysdiff(ar,k);
	}

	private static void subarraysdiff(int[] ar,int k) {

		for (int i = 0; i < ar.length-1; i++) {
			for (int j = i+1; j < ar.length; j++) {
				if(ar[i]-ar[j]==k) {
					System.out.println(ar[i]+" "+ar[j]);
				}
			}
		}
	}
}
