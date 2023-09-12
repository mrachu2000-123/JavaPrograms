
public class cust1 {

		private int cID;
		private String Name;
		private int Num;
		public cust1()
		{
			cID=1;
			Name="Pallavi";
			Num=7654345;
		}
		public cust1(int cID,String Name, int Num)
		{
			this();
			this.cID=cID;
			this.Name=Name;
			this.Num=Num;
		}
		public int getcID()
		{
			return cID;
			
		}
		public String getName() 
		{
			return Name;
		}
		public int getNum() {
			return Num;
		}
		
	public static class Constructor2 {
		public static void main(String[] args) {
			cust1 c2= new cust1(2,"Neeru",7865435);
			System.out.println(c2.getcID());
			System.out.println(c2.getName());
			System.out.println(c2.getNum());
	}
	}
	 }

