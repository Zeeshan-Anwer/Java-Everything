package assignmentPrg;

import java.util.Scanner;

public class _16_Fabonacci_Series {
	
	public static void main(String argsp[]) {

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a numner: ");
	int num=sc.nextInt();
	int a=0,b=1,c=0;
	System.out.println(a);
	System.out.println(b);
	
	for(int i=0;i<num;i++) {
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
	}
	
	}


}