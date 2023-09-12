import java.util.Iterator;
import java.util.Scanner;

public class p17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
	
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();		
		}
		int res = smallestRepeating(ar);
		System.out.println(res);
	}

	public static int smallestRepeating(int[] ar) {
    
		for(int i = ar.length-1;i>=0;i--) {
    	  if(ar[i]==ar[i-1]) {
    		  return ar[i];
    	  }
      }	
		return -1;
	}
}
