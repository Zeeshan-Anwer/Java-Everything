package assignmentPrg;

import java.util.Scanner;

public class _06_Diffrence {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int x=sc.nextInt();
		System.out.println("Enter a number:");
		int y=sc.nextInt();
		
		if((x-y)<5)
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}
