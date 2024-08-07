package assignmentPrg;

import java.util.Scanner;

public class _20DividewithoutOperator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int a=sc.nextInt();
		System.out.println("Enter a no");
		int b=sc.nextInt();
		
		System.out.println(doDivide(a,b));

	}
	
	public static int doDivide(int a,int b) {
		
		int count=0;
		
		while(a!=0) {
			a=a-b;
			count++;
		}
		
		return count;
		
		
	}


	}

