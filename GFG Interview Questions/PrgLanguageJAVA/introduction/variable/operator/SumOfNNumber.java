package introduction.variable.operator;

import java.util.Scanner;

public class SumOfNNumber {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println(nSum(n));
	}
	public static int nSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		return sum;
	}
}
