package flowControl.loop.functions;

public class FindPrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=19;
		System.out.println(isPrime(num));
	}
	
	public  static boolean isPrime(int num)
	{
		if(num<=1)
			return false;
	{
		for(int i=2;i<num;i++)
			//More efficient approach below, instead or upper loop run below mentioned loop
			//for(int i=2;i*i<=n;i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}
}
}
