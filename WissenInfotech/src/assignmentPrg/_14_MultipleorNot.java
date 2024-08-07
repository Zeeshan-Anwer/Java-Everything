package assignmentPrg;

import java.util.Scanner;

public class _14_MultipleorNot {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int a=sc.nextInt();
		System.out.println("Enter Number:");
		int b=sc.nextInt();
		
		if(a%b==0)
			System.out.println("Multiple");
		else
			System.out.println("Not Multiple");
	}

}
