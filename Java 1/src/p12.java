import java.util.Scanner;

public class p12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ar = new int[n];
        
        for(int i=0;i<ar.length;i++) {
        	ar[i] = scan.nextInt();
        }
         long[] res = productOfArray(ar);
         
         for(int i=0;i<res.length;i++) {
        	 System.out.print(res[i] + " ");
         }
   
	}

	private static long[] productOfArray(int[] ar) {
		
		long p = 1;
		
		for(int i=0;i<ar.length;i++) {
			p = p*ar[i];	
		}
		long[] result = new long[ar.length];
		
		for(int i=0;i<result.length;i++) {
			result[i]= p/ar[i];
		}
		
		return result;
	}

}
