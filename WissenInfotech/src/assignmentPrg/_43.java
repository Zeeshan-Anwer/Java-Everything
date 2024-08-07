package assignmentPrg;

public class _43 {
	
	public static void main(String[] args) {
		int n=100;
		System.out.println("The difference between the sum square");

	}
	



public static int add(int a) {
	
	int y=0,x=0,z=0;
	
	for(int i=1;i<=a;i++)
	{
		x=x+(i*i);
	}
	
	System.out.println(x);
	for(int j=1;j<=a;j++)
	{
		y=y+j;
		
	}
	z=y*y;
	return z-x;
}
}



