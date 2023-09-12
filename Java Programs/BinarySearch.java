import java.util.Scanner;

public class BinarySearch {
	
//Binary Search can be applied only to sorted array;
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i]=scan.nextInt();
		}
		int k = scan.nextInt();
		
		System.out.println(binSearch(ar,k));
	}

	 static int binSearch(int[] ar, int k) {

		 int high=ar.length-1, low=0, mid =0;
		 
		 while(low<high) {
			 mid = (low+high)/2;
			 
			 if(ar[mid]==k) {
				 return mid;
			 }else if(k<ar[mid]) {
				 high=mid-1;
			 }else {
				 low=mid+1;
			 }
		 }
		return -1;
	}

}
