package assignmentPrg;

import java.util.Scanner;

public class _09_digitscount {

		public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number:");
			int x=sc.nextInt();
			getCount(x);
					
		}
		
		//Method 2
		public static void getCount(int n){
			int count=0;
			while(n>0)
			{
				if(count>6)
					break;
				n=n/10;
				count++;
			}
			if(count==6)
				System.out.println("exactly 6 digit");
			else
				System.out.println("not exactly 6 digit");
		}
}


