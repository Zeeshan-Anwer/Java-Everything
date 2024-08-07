package assignmentPrg;

import java.util.Scanner;

public class _34_ {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int a=sc.nextInt();
		System.out.println("Enter number");
		int b=sc.nextInt();
	

		if(a<=21 & b<=21)
			System.out.println(Math.max(a,b));
		else if(a<=21)
			System.out.println(a);
		else if(b<=21)
			System.out.println(b);
		else
			System.out.println(0);
		
	}

}
