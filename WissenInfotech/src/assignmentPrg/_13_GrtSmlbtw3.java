package assignmentPrg;

import java.util.Scanner;

public class _13_GrtSmlbtw3 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int a=sc.nextInt();
		System.out.println("Enter Number:");
		int b=sc.nextInt();
		System.out.println("Enter Number:");
		int c=sc.nextInt();
		System.out.println("Greater is: "+greater(a,b,c));
		System.out.println("Smaller is: "+smaller(a,b,c));
	}
	public static int greater(int a,int b,int c) {
		if(a>b & a>c)
			return a;
		else if(b>a & b>c)
			return b;
		else
			return c;
	}
	
	public static int smaller(int a,int b,int c) {
		if(a<b & a<c)
			return a;
		else if(b<a & b<c)
			return b;
		else
			return c;
	}
}
