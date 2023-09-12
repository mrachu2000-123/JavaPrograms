import java.util.Scanner;

public class p26 {
   public static void main(String[] args) {
	   Scanner scan = new Scanner(System.in);
	   int n = scan.nextInt();
	     nMultiplesOfNumber(n);
	   
   }

private static void nMultiplesOfNumber(int n) {
	 
	  int count =0;
	   
	   for(int i=1;count<n;i++) {
		   if(i%2==0 || i%3==0) {
			   System.out.print(i+" ");
			   count++;
		   }
	   }	
   }
}
