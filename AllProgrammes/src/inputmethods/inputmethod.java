package inputmethods;

import java.util.Scanner;
class inputmethod
{
	public static void main(String args[]) 
	{
		Scanner access=new
		Scanner(System.in);
		int n1,n2,n3;
		System.out.print("\n Enter 1st number: ");
		n1=access.nextInt();
		System.out.print("\n Enter 2nd number: ");
		n2=access.nextInt();
		n3=n1+n2;
		System.out.print("Addition:"+n3);
		
		
		
	}
}