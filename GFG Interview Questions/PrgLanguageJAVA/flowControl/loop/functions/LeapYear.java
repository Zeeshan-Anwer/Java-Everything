package flowControl.loop.functions;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y=2000;
		System.out.println(getLeap(y));

	}
	public static String getLeap(int a)
	{
		if(a%4==0 & a%100!=0)
			return("Year is Leap");
		else
			return("Year is not Leap");
	}

}
