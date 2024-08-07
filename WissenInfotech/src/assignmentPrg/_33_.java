package assignmentPrg;

import java.util.Scanner;

public class _33_ {

	public static boolean main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values of a,b and c");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(Math.abs(a-b)<=1 && Math.abs(a-c)>=2 && Math.abs(b-c)>=2)
		{
			return true;
		}
		else if(Math.abs(a-c)>=2 && Math.abs(b-c)>=2)	
			{
				return true;
			}
		else
		{
			return false;
		}
}
}
