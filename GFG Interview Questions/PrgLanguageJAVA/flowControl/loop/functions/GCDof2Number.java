package flowControl.loop.functions;
//GCD:	Greatest Common Factor



/*Given two numbers A and B. The task is to find the GCD of  A and B.
The GCD of two numbers is the largest number that can divide both A and B perfectly.

Example 1:

Input:
A = 6
B = 9
Output:
3
Explanation:
After 3 there is no number that can
divide both 6 and 9 perfectly.
*/

public class GCDof2Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=18,b=30;
		
		System.out.println(GCD(a,b));
	
		
	}
	public static int GCD(int a,int b)
	{
		int Min=Math.min(a,b);
		int ans=0;
		for(int i=1;i<=Min;i++)
		{
			if(a%i==0 & b%i==0)
			ans=i;
		}
		return ans;
	}

}
