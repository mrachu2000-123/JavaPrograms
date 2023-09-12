import java.util.Scanner;

public class SortingString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		char[] arr = str.toCharArray();
		
		sortString(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

	 static void sortString(char[] arr) {

		char temp;
		
		for(int i=0;i<arr.length;i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

}
