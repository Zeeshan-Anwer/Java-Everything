package assignmentPrg;

import java.util.Scanner;

public class _27_SumOf_N_No {
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no:");
		int a=sc.nextInt();
		int i=1,Sum=0;
		while(i<=a) {
			Sum=Sum+i;
			i++;
		}
		System.out.println("Sum of N number: "+Sum);
	}

}
