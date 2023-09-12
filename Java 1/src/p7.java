import java.util.Scanner;

public class p7 {

	public static void main (String[] args) {
		   Scanner sc = new Scanner (System.in);
		   int n = sc.nextInt();
		   
		   int[] ar = new int[n];
		   
		   for(int i=0;i<ar.length;i++) {
			   ar[i]= sc.nextInt();
		   }
		   int x = sc.nextInt();
		   int res =indexOf(ar,x);
		   System.out.println(res);
	   }

	private static int indexOf(int[] ar, int x) {
		
		for(int i=0;i<ar.length;i++) {
			   if(ar[i]==x) {
				   return i;
			   }
		   }
		return -1;
	}
}
