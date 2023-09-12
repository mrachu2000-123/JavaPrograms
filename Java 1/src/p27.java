import java.util.Scanner;

public class p27 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}
	       subStringArray(ar);
	
		}

	private static void subStringArray(int[] ar) {
        
		int i=0;
		while(i<ar.length)
		for (int j = 0; j < ar.length; j++) {
			 {
				  
				 System.out.print(ar[i]+" "+ar[j]);
			}
			 i++;
			
		}
	
	}
}
