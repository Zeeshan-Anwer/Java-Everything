package assignmentPrg;

import java.util.HashSet;
import java.util.Set;


public class _44 {
	
	public static void main(String[] args) {
		int n=40;
		pythagoreamTriplet(n);
	}
	
	public static void pythagoreamTriplet(int n)
	{
		for(int i=1;i<=n/3;i++)
		{
			for(int j=i+1;j<=n/2;j++)
			{
				int k=n-1-j;
				if(i*i+j*j==k*k)
				{
					System.out.println(i+","+j+","+k);
					return;
				}
			}
		}
		System.out.println("Not Triplet");
	}
	
}
	
