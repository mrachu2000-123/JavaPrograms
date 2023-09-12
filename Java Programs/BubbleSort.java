import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < ar.length; i++) {
			ar[i] = scn.nextInt();
		}
        BubbleSort.rearrange(ar);
        for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
	}

	public static void rearrange(int[] ar) {

		for (int i = 0; i < ar.length; i++) {
			int temp = 0;
			for (int j = 0; j < ar.length-1; j++) {
				if(ar[j]>ar[j+1]) {
					temp = ar[j];
					ar[j]=ar[j+1];
					ar[j+1]= temp;
				}
			}
		}
	}

}
