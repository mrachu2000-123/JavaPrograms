import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first String");
		String str1 = scan.next();
		System.out.println("Enter the Second String");
		String str2 = scan.next();
		if(str1.length()==str2.length()) {
			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);

			boolean res = Arrays.equals(ch1, ch2);

			System.out.println(res);
			if(res) {
				System.out.println(str1 +" and " + str2 +" are anagram.");
			}else {
				System.out.println(str1 +" and " + str2 +" not are anagram.");

			}
		}else {
			System.out.println(str1 +" and " + str2 +" not are anagram.");

		}
	}

}
