import java.util.Scanner;

public class SpacesinString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		System.out.println(spaceInString(s));
	}

	private static int spaceInString(String s) {

		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)==' ') {
				count++;
			}
			
		}
		return count;
		
	}

}
