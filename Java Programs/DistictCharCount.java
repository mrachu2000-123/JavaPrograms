import java.util.Scanner;

public class DistictCharCount {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		distinctChar(str);
	}

	static void distinctChar(String str) {

		char[] ar = str.toCharArray();
		SortingString.sortString(ar);
		
//		for (int i = 0; i < ar.length; i++) {
//			System.out.print(ar[i]+" ");
//		}
//		System.out.println();

		int count = 1;
		for (int i = 0; i < ar.length-1; i++) {

			if(ar[i]==ar[i+1]) {
				count++;
			}
			else {
				System.out.println(ar[i]+" "+count);	
				count = 1;
			}
		}
		System.out.println(ar[ar.length-1]+" "+count);
	}
}
