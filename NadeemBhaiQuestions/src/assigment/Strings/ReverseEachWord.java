package assigment.Strings;

import java.util.Scanner;

public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Value: ");
		String data=sc.nextLine();
		getReverseWordFromStart(data);
	}
	public static void getReverseWordFromEnd(String data)
	{
		char space=32;
		int i=data.length()-1;
		do
		{
			while(i>space |i!=-1)
				{
					System.out.print(data.charAt(i));
					i--;
				}
		}
		while(i>-1);
		
	}
	
	public static void getReverseWordFromStart(String data)
	{
		char ch=32;
		int i=0;
		while(i<data.length())
		{
			if(data.charAt(i)==ch || i==data.length()-1)
			{
				for(int j=i-1;j>=0;j--)
				{
					if(data.charAt(j)==ch)
						break;
					System.out.print(data.charAt(j));
				
				}
				System.out.print(ch);
			}
			i++;
		}
	}

}
