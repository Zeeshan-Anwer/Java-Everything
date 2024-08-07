package string_programmes;

import java.util.Scanner;

public class ReplaceWord_7 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Your Sentence");
		String Sentence1=sc.nextLine();
		
		Sentence1=Sentence1.replaceAll("is", "was");
	
		
		System.out.println(Sentence1);
		sc.close();


	}

}
