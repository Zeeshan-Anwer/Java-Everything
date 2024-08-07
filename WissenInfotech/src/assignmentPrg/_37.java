package assignmentPrg;

import java.util.Scanner;

public class _37 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int x=sc.nextInt();
		System.out.println(getCount(x));
				
	}
	
	
	public static boolean getCount(int n){
		int count=0,rem=0;;
		while(n>0)
		{
			rem=n%10;
			n=n/10;
			if(rem!=0)
			count++;
		}
		if(count>1)
			return false;
		else 
			return true;
		
	}
}
