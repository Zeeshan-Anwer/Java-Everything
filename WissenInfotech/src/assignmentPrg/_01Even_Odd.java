package assignmentPrg;

import java.util.Scanner;
public class _01Even_Odd {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		System.out.println(check(num));

	}
	public static String check(int num) {
		if(num%2==0)
			return "Positive";
		else
			return "Negative";
		
	}
}
