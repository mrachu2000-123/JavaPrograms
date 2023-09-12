import java.util.Scanner;
public class p9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int[] ar = new int[n];
		
		for(int i=0;i<ar.length;i++) {
			 ar[i] = scan.nextInt();
		}
		
		
		int res = maxNumber(ar);
		System.out.println(res);
}

	private static int maxNumber(int[] ar) {
		int max = Integer.MIN_VALUE;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>max) {
				max = ar[i];
			}
		}
		return max;
	}
}
