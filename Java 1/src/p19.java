import java.util.Scanner;

public class p19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		
		minSumPair(ar);
	}

	private static void minSumPair(int[] ar) {
		 
		int min = Integer.MAX_VALUE;
		int smin = Integer.MAX_VALUE;
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
		System.out.println("("+min+" "+smin+")"+" "+"---"+" "+(min+smin));
	}
	
}
