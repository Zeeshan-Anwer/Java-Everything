package inputmethods;
import java.util.Scanner; 
public class inout {
	int a,b,c;
public void input()
{
	Scanner z=new Scanner(System.in);
	
	System.out.println("Enter Your Number");
	a=z.nextInt();
			System.out.println("Enter Your Number");
			b=z.nextInt();
	System.out.println("Enter Your Number");
	c=z.nextInt();
}
	public void output()
	{
		System.out.println(a+" "+b+" "+c);
		
	}
	public static void main(String[] args) {
		

	}

}
