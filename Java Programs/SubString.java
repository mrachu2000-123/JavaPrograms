import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s =scan.next();

		subString(s);
	}

	private static void subString(String s) {

		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				for (int k = i; k <=j; k++) {
					
//					System.out.print(s.charAt(k));
					String res="";
					res = res+s.charAt(k);
					System.out.print(res);
					
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}

