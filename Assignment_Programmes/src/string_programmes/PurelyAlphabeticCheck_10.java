package string_programmes;

import java.util.Scanner;

public class PurelyAlphabeticCheck_10 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter String");
		String word=sc.next();
		System.out.println(checkPureAlpha(word));

	}
	
	public static String checkPureAlpha(String data) {
		
		int i=0;
		char arr[]=data.toCharArray();
		while(i<data.length()) {
			if(arr[i]>='0' && arr[i]<='9')
			{
				return "Contains Alphanumeric Character";
			}
			i++;
		}
		return "Purely Alphabetic Character" ;

	}
}

