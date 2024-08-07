package string_programmes;

import java.util.Arrays;

public class Check {

	public static void main(String[] args) {
	
		String str="HeLoLDhHdk";
		StringBuffer strb=new StringBuffer(str);
		
		char arr[]=str.toCharArray();
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isLowerCase(ch))
				strb.setCharAt(i, Character.toUpperCase(ch));
			if(Character.isUpperCase(ch))
				strb.setCharAt(i, Character.toLowerCase(ch));
		}
		System.out.println(strb);
		

	}
}
