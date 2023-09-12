import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x =0,y=1;

		for(int i=0;x<=n;i++) { //upto given number n;
//			for(int i=0;i<n;i++) {  upto n iterations;
			
			System.out.print(x+" ");

			int z = x+y;
			x = y;
			y = z;

		}

	}

}
