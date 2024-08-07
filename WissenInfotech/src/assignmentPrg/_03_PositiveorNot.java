package assignmentPrg;

import java.util.Scanner;

public class _03_PositiveorNot {
	
	public static void main(String args[]) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number:");
	int num=sc.nextInt();
	System.out.println(isPositive(num));
	
	

}
	public static boolean isPositive(int num) {
		if(num>0)
			return true;
		else
			return false;
		
	}
}