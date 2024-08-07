package assignmentPrg;

import java.util.Scanner;

public class _31 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int a=sc.nextInt();
		System.out.println("Enter number");
		int b=sc.nextInt();
		System.out.println("Enter number");
		int c=sc.nextInt();
		
		if(a==b & b==c)
			System.out.println(0);
		else if(a==b)
			System.out.println(c);
		else if(a==c)
			System.out.println(b);
		else if(b==c)
			System.out.println(a);
		else
			System.out.println(a+b+c);
		
		
	}

}
