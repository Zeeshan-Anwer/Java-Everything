package assignmentPrg;

import java.util.Scanner;

public class _29_SumOf_NPowerN {
	
	public static void main(String args[]) {
		
		int n=0,sum=1,result=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a no:");
	n=sc.nextInt();

	for(int i=1;i<=n;i++)
	{
		result=i;
		for(int j=1;j<i;j++) {
			result=result*i;
			
		}
		sum=sum+result;
		
	}
	System.out.println("Sum:"+(sum-1));
	}			
	


}



		