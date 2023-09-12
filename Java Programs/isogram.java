
import java.util.Arrays;
import java.util.Scanner;

public class isogram {

		public static void main(String arg[])
		{
			Scanner sc = new Scanner(System.in);
	
			System.out.println("Enter String");
			String str1 = sc.next();
	
	
			boolean res = is_isogram(str1);
	
			if(res==true)
			{
				System.out.println(str1+"is isogram");
			}
			else {
				System.out.println(str1+"is not isogram");
			}
	
		}
		
		static boolean is_isogram(String str)
		{
			if(str==null) {
				return false;
			}
			str = str.toLowerCase();
			int len = str.length();
			char arr[] = str.toCharArray();
			Arrays.sort(arr);
			for(int i=0;i<len-1;i++)
			{
				if(arr[i]==arr[i+1]) 
					return false;
			}
			return true;
		}

}
