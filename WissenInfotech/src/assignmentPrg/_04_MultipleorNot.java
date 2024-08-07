package assignmentPrg;

import java.util.Scanner;

public class _04_MultipleorNot {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int x=sc.nextInt();
		System.out.println("Enter number:");
		int y=sc.nextInt();
		System.out.println(checkMultiple(x,y));
		
		
	}
	public static boolean checkMultiple(int x,int y) {
		
		if(y%x==0)
			return true;
		else
			return false;

		
	}

}
