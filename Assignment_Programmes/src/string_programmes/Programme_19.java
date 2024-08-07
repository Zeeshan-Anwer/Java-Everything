package string_programmes;

import java.util.Scanner;

public class Programme_19 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Any Word");
		String word=sc.next();
		System.out.println(stringSplosion(word));
	}
	
	public static String stringSplosion(String value) {
	
		int i=0;
		String output="";
		while(i<value.length()){
			for(int j=0;j<=i;j++) 
			output+=value.charAt(j);
			i++;
			}
		return output;
	

}
}
