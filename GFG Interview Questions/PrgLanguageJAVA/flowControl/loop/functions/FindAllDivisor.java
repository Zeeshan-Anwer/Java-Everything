package flowControl.loop.functions;

public class FindAllDivisor {

	public static void main(String[] args) {
		int num=12;
		// TODO Auto-generated method stub
		findDivisor(num);
	}
	
	public static void findDivisor(int num)
	{
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				System.out.println(i);
		}
	}

}
