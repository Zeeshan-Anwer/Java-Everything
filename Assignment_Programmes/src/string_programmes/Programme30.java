package string_programmes;

import java.util.Scanner;

public class Programme30 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.next();
		int i=0,sum=0;
		while(i<str.length()) {
			if( Character.isDigit(str.charAt(i)))
					sum+=Integer.parseInt(str.substring(i,i+1));
			i++;
			
		}
		System.out.println(sum);
	}

}


