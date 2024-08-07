package assignmentPrg;

import java.util.Scanner;

public class _30_RightMostIntegralPart {

		public static void main(String args[]){
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a decimal number");
			float f=sc.nextFloat();
			
	        int op=(int)f;
	        int res=op%10;
	        System.out.println(res);
	        
	        }
}