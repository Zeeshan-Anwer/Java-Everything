package string_programmes;

import java.util.Scanner;

public class AddSecondChar_18 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Any Word");
		String word=sc.nextLine();
		System.out.println(stringBits(word));
	}
	
	public static String stringBits(String value) {
	
		int i=0;
		String output="";
		while(i<value.length()){
			
			output+=value.charAt(i);
			i=i+2;
			}
		return output;

}
}
