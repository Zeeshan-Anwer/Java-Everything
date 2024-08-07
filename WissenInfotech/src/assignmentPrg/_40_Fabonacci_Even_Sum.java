package assignmentPrg;

import java.util.Scanner;

public class _40_Fabonacci_Even_Sum {

	public static void main(String[] args) {
		
		int a=0,b=1,c=0,sum=0;
		
		while(c<4000000) {
			c=a+b;
			if(c%2==0)
				sum=sum+c;
			a=b;
			b=c;
		}
		System.out.println(sum);
		
		}

	}


