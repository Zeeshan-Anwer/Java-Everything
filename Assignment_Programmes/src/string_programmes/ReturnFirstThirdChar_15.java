package string_programmes;

import java.util.Scanner;

public class ReturnFirstThirdChar_15 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Any Word");
		String word=sc.next();
		System.out.println("Enter no of times to repeat");
		int i=sc.nextInt();
		System.out.println(frontTimes(word,i));

	}
	
	public static String frontTimes(String value,int no) {
		String output=""; 
		value=value.substring(0,3);
		while(no>0) {
			output+=value;
			no--;
		}
		return output;
	}

}
