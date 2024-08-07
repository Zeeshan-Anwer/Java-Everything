package string_programmes;

import java.util.Scanner;

public class RemoveNumber_13 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Any Word");
		String word=sc.next();
		char[] arr=word.toCharArray();
		String newword="";
		int i=0;
		
		while(i<word.length()) {
			if(!(arr[i]>='0' && arr[i]<='9'))
				newword+=word.charAt(i);
			i++;

		}
		System.out.println("Without Number: "+ newword);
		
	}

}
