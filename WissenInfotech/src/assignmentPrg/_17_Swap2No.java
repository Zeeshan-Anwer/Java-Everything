package assignmentPrg;

import java.util.Scanner;

public class _17_Swap2No {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int a=sc.nextInt();
		System.out.println("Enter a no");
		int b=sc.nextInt();
		int temp=a;
		
		a=b;
		b=temp;
		
		System.out.println("After Swap");
		System.out.println("First No "+a);
		System.out.println("Second No "+b);

	}

}
