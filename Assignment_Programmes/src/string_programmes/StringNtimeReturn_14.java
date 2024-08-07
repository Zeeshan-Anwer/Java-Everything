package string_programmes;

import java.util.Scanner;

public class StringNtimeReturn_14 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Any Word");
		String word=sc.next();
		System.out.println("Enter no of times to repeat");
		int i=sc.nextInt();
		System.out.println(stringTimes(word,i));

	}
	
	public static String stringTimes(String value,int no) {
		String output="";
		while(no>0) {
			output+=value;
			no--;
		}
		return output;
	}

}
