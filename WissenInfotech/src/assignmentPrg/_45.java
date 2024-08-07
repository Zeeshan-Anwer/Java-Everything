package assignmentPrg;

import java.util.Scanner;

public class _45 {
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		System.out.println("Enter power on number:");
		int power=sc.nextInt();
		long itr=n;
		int i=1;
		
		while(i<power) {
			System.out.println(itr+" "+n);
			itr*=n;
			i++;
			System.out.println(itr+" "+n);
		}
		System.out.println(itr);
		
		long rem=itr,sum=0;
		
		while(itr%10>0) {
			rem=itr%10;
			itr=itr/10;
			sum=sum+rem;
		}
		
		System.out.println("Sum of digit:"+sum);
		
		
		
	}

}
