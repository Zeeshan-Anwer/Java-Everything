package string_programmes;

import java.util.Scanner;

public class CoutnXX_16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		sc.close();
		
		System.out.println(CountXX(str));
	}
	
	public static int CountXX(String str) {
		
		int i=1,count=0;
		while(i<str.length()) {
			if(str.charAt(i)=='x' && str.charAt(i-1)=='x')
				count++;
			i++;
		}
		return count;
	}
}
