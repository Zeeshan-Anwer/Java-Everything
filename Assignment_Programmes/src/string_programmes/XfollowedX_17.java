package string_programmes;

import java.util.Scanner;

public class XfollowedX_17 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Any Word");
		String word=sc.next();
		System.out.println(doubleX(word));
	}
	
	public static boolean doubleX(String value) {
	
		boolean answer=false;
		int i=1;
		
		while(i<value.length()){
			if(value.charAt(i)=='x' & value.charAt(i-1)=='x') {
				return true;}
			i++;
			}
		return answer;

}
}
