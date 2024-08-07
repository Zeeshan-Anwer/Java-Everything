package assignmentPrg;

import java.util.Scanner;

public class _07_between {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int x=sc.nextInt();
		
		if(x>5 & x<27)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
