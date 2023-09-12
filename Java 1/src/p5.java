import java.util.Scanner;
public class p5 {

   public static void main (String[] args) {
	   Scanner sc = new Scanner (System.in);
	   int n = sc.nextInt();
	   
	   int[] ar = new int[n];
	   
	   for(int i=0;i<ar.length;i++) {
		   ar[i]= sc.nextInt();
	   }
	   
	   int res = sumOfArray(ar);
	   System.out.println(res);
   }
   
   public static int sumOfArray(int[] ar) {
      int sum = 0;
	   
	   for(int i=0;i<ar.length;i++) {
		   sum = sum+ar[i];
	   }
	return sum;
  }

}
