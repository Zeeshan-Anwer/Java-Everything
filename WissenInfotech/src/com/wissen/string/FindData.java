package com.wissen.string;

import java.util.Scanner;

public class FindData {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String arr[]= {"BCA","MCA","MCA","MTECH","IIT","NIT"};
		System.out.println("Enter Course to search");
		String input=sc.nextLine();
		
		boolean check=false;
		int i=0;
		while(i<arr.length) {
			
			if(arr[i].equalsIgnoreCase(input)) {
				check=true;
				System.out.println(input+" found at positoin "+(i+1));
			}
			
			i++;
		}
		if(!check)
			System.out.println("No Match Found");
		
		
	}

}
