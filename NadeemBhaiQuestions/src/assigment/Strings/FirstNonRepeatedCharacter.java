package assigment.Strings;

import java.util.Scanner;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your value: ");
		String data=sc.nextLine();
		System.out.println(getFirstOccurance(data));
	}
	public static char getFirstOccurance(String data)
	{
		for(int i=0;i<data.length();i++)
			for(int j=i+1;j<data.length();j++)
			{
				if(data.charAt(i)==data.charAt(j))
				{
					return data.charAt(i);
				}
			}
		return 32;
	}

}
