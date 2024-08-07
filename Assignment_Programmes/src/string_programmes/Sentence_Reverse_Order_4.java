package string_programmes;

import java.util.Scanner;

public class Sentence_Reverse_Order_4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Sentence");
		String Data=sc.nextLine();
		String ExtractData[]=Data.split(" ");
	
		int i=ExtractData.length-1;
		while(i>=0){
			System.out.print(ExtractData[i]+" ");
			i--;
		}
		

	}

}
