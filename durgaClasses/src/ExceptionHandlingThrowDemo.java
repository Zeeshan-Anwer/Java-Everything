import java.util.Scanner;

public class ExceptionHandlingThrowDemo {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		if(age>18)
			System.out.println("You are eligible for voter id");
		else
			throw new ArithmeticException("You are not Eligible for voter id");
	}

}
