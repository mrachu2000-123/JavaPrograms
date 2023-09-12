import java.util.Arrays;
import java.util.Scanner;

public class Anagramwithoutbltin {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();

		withoutBuiltin(str1,str2);

	}

	static void withoutBuiltin(String str1, String str2) {

		String t="";
		String s="";

		for(int i=0;i<str1.length();i++) {

			if(str1.charAt(i)>='A' && str1.charAt(i)<='Z' 
					|| str1.charAt(i)>='a' && str1.charAt(i)<='z' ) {
				t = t+str1.charAt(i);
				t = t.toLowerCase();

			}
		}
		System.out.println(t);

		for(int i=0;i<str2.length();i++) {

			if(str2.charAt(i)>='A' && str2.charAt(i)<='Z' 
					|| str2.charAt(i)>='a' && str2.charAt(i)<='z' ) {
				s = s+str2.charAt(i);
				s = s.toLowerCase();

			}
		}
		System.out.println(s);

		char[] arr1 = t.toCharArray();
		char[] arr2 = s.toCharArray();

		SortingString.sortString(arr1);
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		
		SortingString.sortString(arr2);
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not Anagram");
		}
	}

}
