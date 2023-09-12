import java.util.Scanner;

public class p15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		
		for(int i=0;i<ar.length;i++) {
			ar[i]= scan.nextInt();
		}
		
		int res = missingNumber(ar,n);
		System.out.println(res);
		
	}
  public static int missingNumber(int[] ar, int n) {
		int sum1 = ((n+1)*((n+1)+1))/2;
		int sum2 = 0;
		
		for(int i=0;i<ar.length;i++) {
			
			sum2 = sum2 + ar[i];
			
		}	
		
        	return sum1-sum2;
	}
}
