package assigment.Strings;

import java.util.Scanner;

public class FirstOccuranceDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value: ");
		String data=sc.nextLine();
		getFirstOcc(data);
	}
	
	public static void getFirstOcc(String data)
	{
		int count;
		int i=0;
		while(i<data.length()-1)
		{
			 count=1;
			for(int j=i+1;j<data.length()-1;j++)
			{
				if(data.charAt(i)==data.charAt(j))
					count++;
			}
			if(count>1)
				System.out.print(data.charAt(i)+"-"+count+" ");
				
			i++;
		}
	}

}
