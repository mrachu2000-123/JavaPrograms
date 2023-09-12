import java.util.Scanner;

public class MajorityElement {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i]= sn.nextInt();
		}

		MajorityElement.maxTimeOccured(ar);
	}

	public static void maxTimeOccured(int[] ar) {

		int maxcount = 0 ,ind =0;
		for (int i = 0; i < ar.length; i++) {
			int count = 0;
			for (int j = 0; j < ar.length; j++) {
				if(ar[i]==ar[j]) {
					count++;
				}
			}
			if(maxcount<count) {
				maxcount = count;
				ind = i;
			}
		}
		if(maxcount>=(ar.length/2)) {
			System.out.println(ar[ind]+" ---> "+maxcount);
			System.out.println(ar[ind]+" is the Majority Element");
		}
		else {
			System.out.println("No Majority Element");
		}
	}
}
