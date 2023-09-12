import java.util.Scanner;

public class p18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		
		 maxSumOfPair(ar);
	}

	private static void maxSumOfPair(int[] ar) {
      
		long max = Integer.MIN_VALUE;
		long smax = Integer.MIN_VALUE;
		
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]>max) {
				smax = max;
				max = ar[i];
			}
			else {
				if(ar[i]>smax) {
					smax = ar[i];
				}		
			}
	}
		System.out.println("("+max+" "+smax+")"+" "+"---"+" "+(max+smax));
  }
}
