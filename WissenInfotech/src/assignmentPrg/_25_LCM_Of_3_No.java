package assignmentPrg;

import java.util.Scanner;

public class _25_LCM_Of_3_No {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int a=sc.nextInt();
		System.out.println("Enter number");
		int b=sc.nextInt();
		System.out.println("Enter number");
		int c=sc.nextInt();
		
		int max=checkGreater(a,b,c);
		int ans=max;
		int x=(a*b*c);
		
			for(int i=max;i<x;i++)
			{
			if(a%i==0 & b%i==0 & c%i==0)
			ans=i;
			break;
			
			}
		
		System.out.println(ans);
}

	
	public static int checkGreater(int a,int b,int c) {
		if(a>b & a>c)
			return a;
		else if(b>a & b>c)
			return b;
		else
			return c;
	}

}
