package string_programmes;

import java.util.Scanner;

public class Programme29 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Any Word");
		String word=sc.next();
		System.out.println(doubleX(word));
	}
	
	public static int doubleX(String value) {
	
		int count=0;
		int i=2;
		
		while(i<value.length()){
			if(value.charAt(i)==value.charAt(i-1) && value.charAt(i-1)==value.charAt(i-2)) {
				count++;}
			i++;
			}
		return count;

}
}
