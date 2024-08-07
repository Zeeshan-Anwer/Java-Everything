package string_programmes;

import java.util.Scanner;

public class Programme35 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Your Sentence");
		String Sentence1=sc.nextLine();
		char ch=' ';
		Sentence1=ch+Sentence1;
		
		Sentence1=Sentence1.replaceAll(" is"," is not").trim();
		
	
		
		System.out.println(Sentence1);
		sc.close();


	}

}
