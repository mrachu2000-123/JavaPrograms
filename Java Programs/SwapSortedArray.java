import java.util.Scanner;

public class SwapSortedArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		
		SwapSortedArray.swap(ar);
		
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		
	}

	public static void swap(int[] ar) {

		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			int temp =0, x =0, y =0;
			for (int j = i+1; j < ar.length-1; j++) {
				if(ar[j]<ar[j+1] && temp<ar[j]) {
					temp = ar[j];
					y = j;
				}
				if(ar[i]>temp) {
					x = ar[i];
					ar[i] = temp;
					temp = x;
					count++;
				}
				ar[y] = temp;
			}
			System.out.println(count);
		}
	}

}
