import java.util.Scanner;

public class p28 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		fibonacciSeries(n);
	}

	private static void fibonacciSeries(int n) {

		int k = 0;
		for(int i=0;k<=n;i++) {
			k = k+i;
			System.out.print(k+" ");
		}
		
	}

}
