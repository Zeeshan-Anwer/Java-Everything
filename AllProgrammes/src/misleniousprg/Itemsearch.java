package misleniousprg;

import java.util.Scanner;
class Itemsearch
{
	public static void main(String args[]) 
	{
		char choice='z';
		String userid="Zeeshan",password="Password";
		Scanner obj= new Scanner(System.in);	
		System.out.print("\n\n\t In Case You Forgot Password \n\t Please Use Default Id \"Zeeshan\" & Default Password \"Password\"");
		System.out.print("\nEnter User_Id=\t");
		String uid=obj.next();
		System.out.print("\nEnter Password=\t");
		String upwd=obj.next();
		if(userid.equals(uid) && (upwd.equals(password)))
		
		{
			System.out.println("\"Welcome To My Programme\"");
		do
		{
		int i,item,Desired_Item=000;
		
		boolean isitemexist=false;
		int A[]={11,21,31,41,51,61,71,81,91,100};
		
		
		
		System.out.print("Enter Item for Search=\t");
		item=(obj.nextInt());
		for(i=0;i<10;i++)
			if(A[i]==item)
			{
				Desired_Item=i;
				isitemexist=true;
				System.out.print("\n Desired Item Exist And The Location Number In Array is: "+Desired_Item);
				
				
				do
				
				{
				
				System.out.print("\nDo you want to to search another number?\n Enter  'Y' for Yes & 'N' for No=\t");
				choice=obj.next().charAt(0);
				if(choice=='Y'|choice=='y'|choice=='n'|choice=='N')
					break;
				else
					System.out.println("\n\"Wrong Input\" Please Input Correct Key");
				}
				while(choice!='Y'|choice!='y'|choice!='n'|choice!='N');
				
				

			}
			if(isitemexist==true)
				System.out.print(" ");
			else
			{
				System.out.print("\nDesired Item Not Exist");
				System.out.print("\nDo you want to to search another number?\n Enter  'Y' for Yes &  Anykey For Exit\t");
			choice=obj.next().charAt(0);
			
			}	
	
	}
			while(choice=='Y'|choice=='y');
			
		}
		
		
			 else 
				 System.out.println("Wrong password");
				 
					
		
	}
}
		