import java.util.Scanner;

public class p6 {

	public static void main (String[] args) {
		   Scanner sc = new Scanner (System.in);
		   int n = sc.nextInt();
		   
		   int[] ar = new int[n];
		   
		   for(int i=0;i<ar.length;i++) {
			   ar[i]= sc.nextInt();
		   }
		   
		  int x = sc.nextInt();
		  
		   int res = mostOccurance(ar,x);
		   System.out.println(res);
	   }

	private static int mostOccurance(int[] ar, int x) {
		int count = 0;
		
		for(int i=0;i<ar.length;i++) {
			
			if(ar[i]==x) {
				count++;
			}
	}
		return count;
	}
}
