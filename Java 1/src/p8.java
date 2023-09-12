
import java.util.Scanner;

public class p8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int[] ar = new int[n];
		
		for(int i=0;i<ar.length;i++) {
			 ar[i] = scan.nextInt();
		}
		int x = scan.nextInt();
		
		int res = lastOccurance(ar, x);
		System.out.println(res);
		
	}

	private static int lastOccurance(int[] ar, int x) {
		
		for(int i = ar.length-1;i>=0;i--) {
			if(ar[i]==x) {
				return i;
			}	
		}
		return -1;
	}
}
