package specialcase;

import java.io.*; 
 class PerfectNoThroughDataInpurStream
{
	public static void main(String args[]) throws IOException
	{
		int num,sum=0;
		DataInputStream obj = new
		DataInputStream(System.in);
		System.out.print("\n Enter Your Number: ");
		num=Integer.parseInt(obj.readLine());
		for(int i=1;i<num-1;i++)
			if(num%i==0)
			
				 
				sum=sum+i;
			
				
			if(sum==num)
				System.out.println(num+" is Perfect Number");
			else
				System.out.println(num+" is not Perfect Number");
	}
}