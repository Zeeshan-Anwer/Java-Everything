package whileloop;
import java.util.Scanner;
public class sumofdigit {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number=");
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		
		while(temp>0)
		{
			int lastdigit =temp %10;
			temp/=10;
			
			sum+=lastdigit;
		}
		
		System.out.println("the sum of digit of "+ n + "is " +sum);
	}

}
