package assignmentPrg;

import java.util.Scanner;

public class _08_Digit {

		public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number:");
			int x=sc.nextInt();
			System.out.println(getCount(x));
					
		}
		
		public static boolean getCount(int n){
			int count=0;
			while(n>0)
			{
				n=n/10;
				count++;
			}
			if(count>4)
				return true;
			else
				return false;
		}
}


