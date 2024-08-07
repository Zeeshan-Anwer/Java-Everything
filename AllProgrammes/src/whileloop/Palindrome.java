package whileloop;

import java.util.Scanner;
class Palindrome
{
	public static void main(String args[])
	{
	int rev=0;
	Scanner obj = new 
	Scanner(System.in);
	System.out.print("Enter Your Number=\t");
	int num=obj.nextInt();
	System.out.println("You Entered=    \t" +num);
	int check=num;
	
	while(num>0)
	{
		int temp=num%10;
		rev=(rev*10)+temp;
		num=num/10;
		
	}
		if(check==rev)
			System.out.println(check+" is Palindrome");
		else
			System.out.println(check+" is Not Palindrome");
	}
}