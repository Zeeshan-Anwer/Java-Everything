package flowControl.loop.functions;

public class FirstDigitOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=15600;
		System.out.println(showFirstDigit(n));
	}
	
	public static int showFirstDigit(int num)
	{
		while(num>10)
		
			num=num/10;
		
		return num;
	}

}
