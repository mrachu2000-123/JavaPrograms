import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.next();

		System.out.println(palindromeStr(s));
	}

	static Boolean palindromeStr(String s) {

		for (int i = 0,j=s.length()-1;;) {
			while(i<j) {
				if(s.charAt(i)==s.charAt(j)) {
					i++;
					j++;
				}else {
					return false;
				}
				return true;
			}
		}
		
	}
}