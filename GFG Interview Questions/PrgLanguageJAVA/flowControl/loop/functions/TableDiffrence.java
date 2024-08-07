package flowControl.loop.functions;

public class TableDiffrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=9,b=4;
		diffrence(a,b);
	}
	public static void diffrence(int a,int b)
	{
		String s=" ";
		for(int i=1;i<=10;i++)
		
		{
			System.out.println((a*i)-(b*i)+" ");
			s=s+" "+((a*i)-(b*i));
		}
		System.out.println(s);
	}

}
