package assignmentPrg;

import java.util.Scanner;

public class _32_ {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int a=sc.nextInt();
		System.out.println("Enter number");
		int b=sc.nextInt();
		System.out.println("Enter number");
		int c=sc.nextInt();
		
		if(a==13)
			System.out.println(0);
		else if(b==13)
			System.out.println(a);
		else if(c==13)
			System.out.println(a+b);
		else
			System.out.println(a+b+c);
		
		
	}

}
