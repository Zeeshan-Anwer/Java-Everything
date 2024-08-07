package com.wissen.Test;

public class StringCount {

	public static void main(String[] args) {
		
		String s="Hello World 34";
		
		int ch=0,word=0,space=0,num=0;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<'z' || s.charAt(i)>='A' && s.charAt(i)<'Z')
				ch++;
			else if(s.charAt(i)>=0 && s.charAt(i)<=9 )
				num++;
			
		}
		
		System.out.println("Total Character: "+ch+"\nTotal Number: "+num);
	}

}
