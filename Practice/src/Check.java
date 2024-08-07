
enum Days {
	Monday,Tuesday;
	public static void main (String args[]) {
		System.out.println();
}


 enum Color 
	{
		Green(15),Blue(13),Red(12);
	 int price;
	 Color(int price)
	 {
		 this.price=price;
	 }
		
		public static void main(String args[]) {
			System.out.println("Zeeshan Anwer");
		}
	}
 
 

public class Check {
	

	
	
	
	public static void main(String[] args) {
		
		Color c=Color.Green;
		//System.out.println(Color.Green);
		
		switch(c)
		{
		
		case Blue:
			System.out.println("hi");
		case Green:
			System.out.println("bye");
		}
		
		Color val[]=Color.values();
		for(Color pr:val)
			System.out.println("The index value of" +pr +pr.ordinal());
		
	
	}

}
