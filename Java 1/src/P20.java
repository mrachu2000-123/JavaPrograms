import java.util.Scanner;

public class P20 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int[] ar = new int[n];
	
	for(int i=0;i<ar.length;i++) {
		ar[i] = scan.nextInt();
	   }
	     maxProductPair(ar);
	    
	}

	private static void maxProductPair(int[] ar) {

		int max = Integer.MIN_VALUE;
		int smax = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int smin = Integer.MAX_VALUE;
		
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
		long  p1 = max*smax;
		
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]<min) {
				smin = min;
				min = ar[i];
			    }
			else {
				if(ar[i]<smin){
					smin = ar[i];
				}
			}
		 }
		long p2 = min*min;
		
		if(p1>p2) {
			System.out.println("("+max+" "+smax+")"+" "+"---"+" "+(p1));
		}
		else {
			System.out.println("("+min+" "+smin+")"+" "+"---"+" "+(p2));
		}
	}
}
