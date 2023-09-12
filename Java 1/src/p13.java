import java.util.Scanner;

public class p13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		
		for(int i=0;i<ar.length;i++) {
	     ar[i] = scan.nextInt();	
		}
       
		int res = largestOccurance(ar);
		System.out.println(res);
	}

	private static int largestOccurance(int[] ar) {
		int max = Integer.MIN_VALUE;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>max) {
				max = ar[i];
			}
		}	
		System.out.println(max);
		
			int count = 0;
			for(int j=0;j<ar.length;j++) {
				if(ar[j]==max) {
					count++;
				}
			}
			return(count);	
	
	}

}
