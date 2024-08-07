package assignmentPrg;

import java.util.Scanner;
//Some doubts

public class _26_HCF_3NO {
	
	public static int checkGreater(int a,int b,int c) {
		if(a<b & a<c)
			return a;
		else if(b<a & b<c)
			return b;
		else
			return c;
	}

	public static void main(String[] args) {

			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number");
			int a=sc.nextInt();
			System.out.println("Enter number");
			int b=sc.nextInt();
			System.out.println("Enter number");
			int c=sc.nextInt();
			
			int min=checkGreater(a,b,c);
			int ans=min;
			//int x=(a*b*c);
			
				for(int i=min;i>0;i--)
				{
				if(a%i==0 & b%i==0 & c%i==0)
				ans=i;
				break;
				
		}
			
			System.out.println(ans);
	}

		
		
}

	


