package assignmentPrg;

import java.util.Scanner;

public class _19Multiply2NoWithoutOperator {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int a=sc.nextInt();
		System.out.println("Enter a no");
		int b=sc.nextInt();
		
		System.out.println(doMultiply(a,b));

	}
	
	public static int doMultiply(int a,int b) {
		int res=0;
		while(b>0) {
			res=res+a;
			b--;
		}
		return res;
		
		
	}
}



