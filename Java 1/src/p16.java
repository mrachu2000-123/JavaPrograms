import java.util.Scanner;

public class p16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		
		for(int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt(); 
		}
		
		 mostOccured(ar);
	}

	private static void mostOccured(int[] ar) {
		int count = 1;
		int max = 0, maxnum = 0;
		for( int i = 0; i < ar.length-1; i++) {
			if(ar[i]==ar[i+1]) {
				count++;
			}
			else {
				if(count>max) {
					max = count;
					maxnum = ar[i];
				}
				count = 1;
			}	
		}
		  if(count>max) {
			max = count;
			maxnum = ar[ar.length-1];
		}
		
		System.out.println(maxnum+" "+ "----"+" "+max);
	}
}
