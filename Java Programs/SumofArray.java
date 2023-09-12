import java.util.Scanner;

public class SumofArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		
		 SumofArray.sumArray(ar);
		
	}

	public static void sumArray(int[] ar) {
		
		
		for (int i = 0; i < ar.length; i++) {
			int temp =0;
			for (int j = 0; j < ar.length; j++) {
				if(i != j) {
					temp = temp+ar[j];
				}
			}
			System.out.print(temp+" ");
		
			
			
		}
	}
}
