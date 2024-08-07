package assignmentPrg;

import java.util.Scanner;

public class _11_FactPrimeOrNot {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int Fact=1;
		while(num>0)
		{
			Fact=Fact*num;
			num--;
		}
	
		System.out.println(_02_Prime.isPrime(Fact));
	}

}


