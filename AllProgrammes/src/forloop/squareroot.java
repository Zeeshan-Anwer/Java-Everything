package forloop;
import java.util.Scanner;
public class squareroot {

	
	public static void main(String[] args) {
	
		Scanner z=new Scanner(System.in);
		
		
	/*	
		
		
		System.out.println("Enter your number=");
		a=z.nextInt();
		int d=a;
		System.out.println("Enter your square times=");
		b=z.nextInt();
		
		for(int i=1;i<b;i++)
		{
		d=a*d;
		}
		System.out.println("Your result is: "+d);
		*/
		
		int a=z.nextInt();
		int b=z.nextInt();
		
		int result =1; 
		
		for(int i=0; i<b; i++)
		{
			result *=a;
		}
		System.out.println(result);
	}

}
