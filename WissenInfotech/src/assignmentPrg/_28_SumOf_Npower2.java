package assignmentPrg;

import java.util.Scanner;

public class _28_SumOf_Npower2 {

	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no:");
		int num=sc.nextInt();
		int i=1,Sum=0;
		while(i<=num) {
			Sum=Sum+(i*i);
			i++;
		}
		System.out.println("Sum of N number: "+Sum);

	}

}
