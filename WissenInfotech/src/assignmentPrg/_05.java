package assignmentPrg;

import java.util.Scanner;

public class _05 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int x=sc.nextInt();
		
		if(x>-2 & x<13)
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}
