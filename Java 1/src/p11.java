import java.util.Scanner;

public class p11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		
		for(int i=0;i<ar.length;i++) {
			ar[i] = scan.nextInt();
		}
		
		int res = sumOfMaxMin(ar);
		System.out.println(res);	
	}

	private static int sumOfMaxMin(int[] ar) {
		
		int max = Integer.MIN_VALUE;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>max) {
				max = ar[i];
			}
		}
		
		int min = Integer.MAX_VALUE;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]<min) {
				min = ar[i];
			}
		}
		int sum = max + min;
        
		return sum;
	}
}
