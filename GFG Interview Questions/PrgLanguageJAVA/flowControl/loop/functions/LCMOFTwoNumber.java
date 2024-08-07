package flowControl.loop.functions;

public class LCMOFTwoNumber {
	
	//NOT Completed

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=6,b=9;
		int ans=0;
		int max=Math.max(a,b);
		int x=(a*b);
		while(max<(x))
		{
			for(int i=1;i<x;i++)
			{
			if(a%i==0 & b%i==0)
			ans=i;
			break;
			
			}
		}
		System.out.println(ans);
}
}
