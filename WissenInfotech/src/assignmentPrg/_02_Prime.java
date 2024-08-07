package assignmentPrg;

import java.util.Scanner;

public class _02_Prime {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		System.out.println(isPrime(num));
	}
	
	public  static boolean isPrime(int num)
	{
		if(num<=1)
			return false;
	{
		for(int i=2;i<num;i++)
			
		{
			if(num%i==0)
				return false;
		}
		return true;
	}
}
}
