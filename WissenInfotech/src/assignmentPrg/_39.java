package assignmentPrg;

import java.util.Scanner;

public class _39 {
	
	public static void main(String[] args) {
				
		int i=1,sum=0;
		while(i<1000) {
			if(i%3==0 | i%5==0)
				sum=sum+i;
			i++;
		}
		System.out.println(sum);
	}

}
