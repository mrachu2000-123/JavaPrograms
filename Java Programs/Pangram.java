import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		s=s.toLowerCase();
		int count =0;

		for(char i='a';i<='z';i++) {
			if(indexOf(s, i)>=0) {
				count++;	
			}
		}
		if(count==26) {
			System.out.println("Pangram");
		}else {
			System.out.println("Not Pangram");
		}
	}

	static int indexOf(String s, char n) {

		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==n) {
				return i;
			}
		}
		return -1;
	}

}
