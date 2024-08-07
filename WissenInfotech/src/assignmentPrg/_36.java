package assignmentPrg;

import java.util.Scanner;

public class _36 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int a=sc.nextInt();
		System.out.println("Enter number");
		int b=sc.nextInt();
		System.out.println("Enter number");
		int c=sc.nextInt();
		
		int sum=0;
		if(a>5)
			sum+=a%5;
		if(b>5)
			sum+=b%5;
		if(c>5)
			sum+=c%5;
		
		System.out.println("Ans:"+sum);
	
		

	}

}
