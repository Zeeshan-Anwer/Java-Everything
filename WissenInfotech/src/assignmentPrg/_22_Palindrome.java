package assignmentPrg;

import java.util.Scanner;

public class _22_Palindrome {
		
		public static void main(String argsp[]) {

			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a numner: ");
			int num=sc.nextInt();
			int temp=num,rev=0,rem=0;;
			while(num%10>0) {
				rem=num%10;
				num=num/10;
				rev=rev*10+rem;
			}
			System.out.println(rev);
		

				
			}
	}

