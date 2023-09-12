import java.util.Scanner;

public class UniqueElementsCount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}

		uniqueElementsOccured(ar);
	}

	static void uniqueElementsOccured(int[] ar) {

		int count = 1;
		int uniquecount=0;
		
		for (int i = 0; i < ar.length-1; i++) {
			if(ar[i]==ar[i+1]) {
				count++;
			}else {
				if(count == 1) {
					uniquecount++;
				}
				count =1;
			}
		}
		if(count ==1) {
			uniquecount++;
		}

		System.out.println(uniquecount++);
	}

}
