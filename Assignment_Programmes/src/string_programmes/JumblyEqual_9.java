package string_programmes;

import java.util.Arrays;
import java.util.Scanner;

public class JumblyEqual_9 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter Any Word");
		String word1=sc.next();
		System.out.println("Enter Any Word");
		String word2=sc.next();
		sc.close();
		
		char arr1[]=word1.toCharArray();
		char arr2[]=word2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2))
			System.out.println("String are jumbly equal");
		else
			System.out.println("String are not jumbly equal");

	}

}
