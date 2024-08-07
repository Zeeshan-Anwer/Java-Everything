package assignmentPrg;

import java.util.Scanner;

public class _18_Add2NowithoutOperator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int a=sc.nextInt();
		System.out.println("Enter a no");
		int b=sc.nextInt();
		
		System.out.println(doAdd(a,b));

	}
	
	public static int doAdd(int a,int b) {
		
		while(a>0) {
			b++;
			a--;
		}
		return b;
		
		
	}

}
