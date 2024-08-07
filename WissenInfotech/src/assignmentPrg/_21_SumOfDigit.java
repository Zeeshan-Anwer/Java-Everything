package assignmentPrg;

import java.util.Scanner;

public class _21_SumOfDigit {
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int rem=0,sum=0;
		
		while(num%10>0) {
			rem=num%10;
			num=num/10;
			sum=sum+rem;
		}
		System.out.println("Sum of digit: "+sum);
		
	}

}
