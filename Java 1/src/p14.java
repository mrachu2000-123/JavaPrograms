import java.util.Scanner;
public class p14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		
		for(int i=0;i<ar.length;i++) {
			ar[i] = scan.nextInt();
		}
        
		int res = secondLargest(ar);
		System.out.println(res);
	}

	private static int secondLargest(int[] ar) {
		int max = Integer.MIN_VALUE;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>max) {
				max = ar[i];
			}
		}	
		int smax = Integer.MIN_VALUE; 
		for(int i=0;i<ar.length;i++) {
		    if(ar[i]<max && ar[i]>smax) {
		    	smax = ar[i];
		    }
		}
		return smax;
	}

}
