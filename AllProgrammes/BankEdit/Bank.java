import java.util.*;
import java.util.Scanner;
import java.io.Console;

class logi
{
    String name;
    Console cnsl;

    logi()
    {
	System.out.println("\t                                    ___    ___     ____    ___             ___    ___                    ");
        System.out.println("\t      |   |   |\\  |   |   \\    /   |      |   \\   |       |___|  |        |   )  |___|   |\\  |  | /     ");
        System.out.println("\t      |   |   | \\ |   |    \\  /    |---   |___/   `----,  |   |  |        |---*  |   |   | \\ |  ||      ");
        System.out.println("\t      (___)   |  \\|   |     \\/     |___   |   |    ____|  |   |  |____    |___)  |   |   |  \\|  | \\    ");
	System.out.println("\t  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n\n\n");





                                            
	System.out.println("\n\n\n\n");
        System.out.println("\t\t                           ((((())))");
        System.out.println("\t\t                        (//@@@@@@@@@@@");
        System.out.println("\t\t                      ((//@@@@@@@@@@@@@@");
        System.out.println("\t\t                    (//@@@@@@@@@@@@@@@@@@@");
        System.out.println("\t\t                   (//@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("\t\t                  (//@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("\t\t                 (/@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("\t\t                (//                          @@ ");
        System.out.println("\t\t                (// WELCOME TO UNIVERSAL BANK @@");
        System.out.println("\t\t                (//                           @@");
        System.out.println("\t\t                (/@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("\t\t                 (//@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("\t\t                  (//@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("\t\t                   (//@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("\t\t                    (//@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("\t\t                     (//@@@@@@@@@@@@@@@@@@@");
        System.out.println("\t\t                       (//@@@@@@@@@@@@@@@@");
        System.out.println("\t\t                           (((((())))))");
        System.out.println("\t\t		 	       ||||  ");
        System.out.println("\t\t		 	       ||||  ");
        System.out.println("\t\t           	       HHHHHHHHHHHHHHHHHHHH");
        System.out.println("\t\t           	       HHHHHHHHHHHHHHHHHHHH\n\n\n\n");




        System.out.print("\n\n\n\n\t\t*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~**~*~*~*~*~*~*~*~*~*");
        System.out.print("\n\t\t!                                                                                !");
        System.out.print("\n\t\t*                             PROJECT DETAILS                                    *");
        System.out.print("\n\t\t!                                                                                !");
        System.out.print("\n\t\t*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~**~*~*~*~*~*~*~*~*~*~*~*");
        System.out.print("\n\t\t!	     	                                                                 !");
        System.out.print("\n\t\t*          Project Type		        : Mini Project Based on Consol           *");
	System.out.print("\n\t\t!	     	                                                                 !");
        System.out.print("\n\t\t*          Students Name		: 1.MD.MAAZ AHMAD     2.MD.NADEEMUDDIN   *");
	System.out.print("\n\t\t!	     	                                                                 !");
        System.out.print("\n\t\t*	   Roll No			:  19                   20               *");
	System.out.print("\n\t\t!	     	                                                                 !");
        System.out.print("\n\t\t*	   Course			: MASTER IN COMPUTER APPLICATION         *");
	System.out.print("\n\t\t!	          	                                                         !");
        System.out.print("\n\t\t*	   Session			: 2016-2019                              *");
	System.out.print("\n\t\t!	                                                                         !");
        System.out.print("\n\t\t*	   Under Guidance of	        : RASHMI SHEKHAR & TANWEER ALAM          *");
        System.out.print("\n\t\t!		     		         (FACULTY OF MCA, DEPT.OF STATISTIC)     !");
	System.out.print("\n\t\t*	     	                                                                 *");
        System.out.print("\n\t\t!~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~**~*~*~*~*~*~*~*~*~*~*~*~!\n\n\n\n\n\n\n");


        System.out.println("Please Enter User-ID and Password \n\n");
        int i,j=2,v=2;
        String a;
        Scanner sc = new Scanner(System.in);
        cnsl = System.console();
        for(i=0; i<3; i++)		//	For 3 Attempts
        {
            System.out.print("User-ID:  ");
            name = sc.next();
            if(name.equalsIgnoreCase("Nadeem") )
            {
                System.out.print("Password:  ");
                char [] inp= cnsl.readPassword();	// Problem	
                String pwd = String.valueOf(inp);	//Problem
                if(pwd.equals("nadeem"))
                {
                    System.out.println("\n\n\tLOGIN SUCEESFULLY!!");
                    i=0;
                    j=2;		//why
                }
                else
                {
                    i=0;
                    if(v>0)
                    {
                        System.out.println("\n    Wrong Password!\n\n\tYou have "+ v--+" Chance Remaining.\n\n   Please Enter Currect Password\n");
                        continue;
                    }
                    if(v==0)
                    {
                        System.out.println("Please contact your Branch Manager");
                        System.exit(0);		//prob
                    }
                }

            }
            else if(name.equalsIgnoreCase("Maaz") )
            {
                System.out.print("Password:  ");
                char [] inp= cnsl.readPassword();
                String pwd = String.valueOf(inp);
                if(pwd.equals("maaz"))
                {
                    System.out.println("LOGIN SUCEESFULLY!!");
                    i=0;
                    j=2;
                }
                else
                {
                    i=0;
                    if(v>0)
                    {
                        System.out.println("Wrong Password\n\n\tYou have "+ v--+" Chance Remaining.\n\nPlease Enter Currect Password\n");
                        continue;
                    }
                    if(v==0)
                    {
                        System.out.println("Please contact your Branch Manager");
                        System.exit(0);
                    }
                }
            }
            else if(name.equalsIgnoreCase("Rashmi") )
            {
                System.out.print("Password: ");
                char [] inp= cnsl.readPassword();
                String pwd = String.valueOf(inp);
                if(pwd.equals("shekhar"))
                {
                    System.out.println("LOGIN SUCEESFULLY!!");
                    i=0;
                    j=2;
                }
                else
                {
                    i=0;
                    if(v>0)
                    {
                        System.out.println("Wrong Password\n\n\tYou have "+ v--+" Chance Remaining.\n\nPlease Enter Currect Password\n");
                        continue;
                    }
                    if(v==0)
                    {
                        System.out.println("Please contact your Branch Manager");
                        System.exit(0);
                    }
                }
            }
            else
            {
                if(j>=1)
                {
                    System.out.println("\n\tInvalid User-ID ->  "+name+":\n\n\t\tYou have "+j-- +"Chance Remaining.\n\n\tPlease Enter a Valid User-ID\n\n");
                    continue;
                }
                else
                {
                    System.out.println("Not a Valid User.Please Contact Baranch Manager\n\n***HAVE A Nice DAY***");
                    i=0;
                    j=0;
                    continue;
                }

            }
            break;
        }


    }
}

class Customer extends logi
{
    String fst_nm,lst_nm,prmnt_add,acnt_type;
    int i,j=2,bal,k,t,n,c;
    String cnt_no,b;
    static int acnt_no;
    boolean isStringNo = true;
    Customer()
    {
        acnt_no =35175;
        c=1;
        do
        {
            System.out.print("\n\n\n\n\t\t 		|~!~!~!~!~!~!~!~!~!~!~!~!~!~!~!~!~!~!~!~!|");
            System.out.print("\n\t\t 		*                                        *");
            System.out.print("\n\t\t 		*       WELCOME TO ACCOUNT SECCTION      *");
            System.out.print("\n\t\t 		*          			         *  ");
            System.out.print("\n\t\t 		|****************************************|\n\n");
            System.out.println("\n\n\nMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMMWMWMWMWMWMWMWMWMW\n");
            Scanner sc = new Scanner(System.in);
            if(c==1)
            {
                System.out.println("\nCreate a New Account");
                System.out.print("____________________________________________________________________________");
                System.out.println("\n\nPlease Fill All Secction\n\n");
                {
                    fst_nm  = " ";
                    String exit = "exit";
                    boolean isStringNumber = true;
                    while(true)
                    {
                        System.out.print("\tEnter Your First Name: ");
                        fst_nm = sc.next();
                        if(fst_nm.equalsIgnoreCase(exit))	//what exit
                        {
                            break;

                        }
                        isStringNumber = fst_nm.matches("[a-z || A-Z]+");
                        if(isStringNumber == false)
                        {
                            System.out.println("\n\n\t  Remove all Number or Special Character from ->  " + fst_nm);
                            System.out.println("\n\t\t Try again!\n\n");
                            continue;
                        }
                        else
                        {

                        }
                        break;
                    }
                }
                // for last name
                {
                    lst_nm  = " ";
                    String exit = "exit";
                    boolean isStringNumber = true;
                    while(true)
                    {
                        System.out.print("\n\tEnter Your Last Name: ");
                        lst_nm = sc.next( );

                        if(lst_nm.equalsIgnoreCase(exit))
                        {
                            break;
                        }

                        isStringNumber = lst_nm.matches("[a-z || A-Z]+");

                        if(isStringNumber == false)
                        {
                            System.out.println("\n\n\tRemove all Number or Special Character from ->  " +lst_nm);
                            System.out.println("\n\t\tTry again!\n\n");
                            continue;
                        }
                        else
                        {

                        }
                        break;
                    }
                }
                // for Address
                {

                    prmnt_add  = " ";
                    String exit = "exit";
                    boolean isStringNumber = true;
                    while(true)
                    {
                        System.out.print("\n\tEnter Your Address: ");
                        prmnt_add = sc.next( );
                        if(prmnt_add.equalsIgnoreCase(exit))
                        {
                            break;
                        }
                        isStringNumber = prmnt_add.matches("[a-z || A-Z]+");
                        if(isStringNumber == false)
                        {
                            System.out.println("\n\n\tRemove all Number or Special Character from ->  " + prmnt_add);
                            System.out.println("\n\t\tTry again!\n\n");
                            continue;
                        }
                        else
                        {

                        }
                        break;
                    }
                }
                cnt_no = Temp();
                bal = 0;
                for(i=0;i<3;i++)
                {
                    
                    b = Temp1();
                    if(Integer.parseInt(b) == 1)
                    {
                        j=2;
                        acnt_type = "Current";
                        k++;
                        i=0;
                        acnt_no++;
                        System.out.println("\n\n\n\t\t-----(*_*)----- Thanks to became a Part Of UNIVERSAL BANK-----(*_*)----- \n\n");
                        System.out.println("\tYour New Account Number is:- "+acnt_no+"\n\tPlease Note Your Account Number for Future use:\n\n");
                        mainWindow();
                        break;
                    }
                    else if(Integer.parseInt(b) ==2)
                    {
                        j=2;
                        acnt_type = "Saving ";
                        k++;
                        i=0;
                        acnt_no++;
                        System.out.println("\n\n\n\t\t-----(*_*)----- Thanks to became a Part Of UNIVERSAL BANK-------(*_*)------\n\n");
                        System.out.println("  Your New Account Number is:- "+acnt_no+"\nPlease Note Your Account Number for Future use:\n\n");
                        mainWindow();
			break;
                    }

                    else
                    {
                       
                            System.out.println("\n\n\tSorry You entered invalid input. Please Choose either 1 or 2 only.");
                            System.out.println("\n\t\tTry Again!");
			    i=0;	
			    continue;
                       
                       
                    }

                }
              c++;
            }
            else
            {
                System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("      Enter Your Option");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                System.out.println("\nPress 1 for Create a New Account And press 2 for Already Have an Account:\n");
                System.out.println("____________________________________________________________________________");
                int a = sc.nextInt();
                if(a==1)
                {
                    System.out.println("\n\nPlease Fill All Secction\n\n");
                    {
                        fst_nm  = " ";
                        String exit = "exit";
                        boolean isStringNumber = true;
                        while(true)
                        {
                            System.out.print("\tEnter Your First Name: ");
                            fst_nm = sc.next();
                            if(fst_nm.equalsIgnoreCase(exit))
                            {
                                break;

                            }
                            isStringNumber = fst_nm.matches("[a-z || A-Z]+");
                            if(isStringNumber == false)
                            {
                                System.out.println("\n\n\t  Remove all Number or Special Character from ->  " + fst_nm);
                                System.out.println("\n\t\tTry again!\n\n");
                                continue;
                            }
                            else
                            {

                            }
                            break;
                        }
                    }
                    // for last name
                    {

                        lst_nm  = " ";
                        String exit = "exit";
                        boolean isStringNumber = true;
                        while(true)
                        {
                            System.out.print("\n\tEnter Your Last Name:");
                            lst_nm = sc.next( );
                            if(lst_nm.equalsIgnoreCase(exit))
                            {
                                break;
                            }
                            isStringNumber = lst_nm.matches("[a-z || A-Z]+");
                            if(isStringNumber == false)
                            {
                                System.out.println("\n\n\t  Remove all Number or Special Character from ->  " +lst_nm);
                                System.out.println("\n\t\tTry again!\n\n");
                                continue;
                            }
                            else
                            {

                            }
                            break;
                        }
                    }
                    // for Address
                    {
                        prmnt_add  = " ";
                        String exit = "exit";
                        boolean isStringNumber = true;
                        while(true)
                        {
                            System.out.print("\n\tEnter Your Address: ");
                            prmnt_add = sc.next( );
                            if(prmnt_add.equalsIgnoreCase(exit))
                            {
                                break;
                            }
                            isStringNumber = prmnt_add.matches("[a-z || A-Z]+");
                            if(isStringNumber == false)
                            {
                                System.out.println("\n\n\t  Remove all Number or Special Character from ->  " + prmnt_add);
                                System.out.println("\n\t\tTry again!\n\n");
                                continue;
                            }
                            else
                            {

                            }
                            break;
                        }
                    }
                    cnt_no = Temp();
                    
                    bal = 0;
                    
                    for(i=0;i<3;i++)
                    {
			b = Temp1();
                        if(Integer.parseInt(b) == 1)
                        {
                            acnt_type = "Current";
                            k++;
                            i=0;
                        }
                        else if(Integer.parseInt(b) ==2)
                        {
                            acnt_type = "Saving ";
                            k++;
                            i=0;
                        }
                        else
                        {
                           
				 
                            System.out.println("\n\n\tSorry You entered invalid input. Please Choose either 1 or 2 only.");
                            System.out.println("\n\t\tTry Again!");
			    i=0;	
			    continue;

                           
                        }
                      
                        break;
                    }
                    acnt_no++;
                    System.out.println("\n\n\n\t\t-----(*_*)----- Thanks to became a Part Of UNIVERSAL BANK-----(*_*)----- \n\n");
                    System.out.println("  Your New Account Number is:- "+acnt_no+"\nPlease Note Your Account Number for Future use:\n\n");
                    mainWindow();
                }
                else if (a == 2)
                {
                    j=2;
                    try
                    {
                        for(i=0;i<3;i++)
                        {
                            int account;
                            System.out.println("Please Enter your Account Number");
                            account = sc.nextInt();
                            if(account == acnt_no)
                            {
                                i=0;
                                mainWindow();
                                break;
                            }
                            else
                            {
                                if(j>=0)
                                {
                                    System.out.println("Sorry You Entered invalid Account Number.Your "+j--+" Chance Remaining. ");
                                    continue;
                                }
                                else
                                {
                                    System.out.println("Sorry Your not eligible to Open Account");
                                }
                                break;
                            }

                        }
                    }
                    catch(NullPointerException e)
                    {
                        e.printStackTrace();
                        System.out.println("\n \n\t Please First Create an Account");
                    }
                }
                else
                {
                    for(i=0;i<3;i++)
                    {

                        if(j>=0)
                        {
                            i=0;
                            System.out.println("Sorry You entered invalid Option.Your "+j--+" Chance Remaining... ");

                        }
                        else
                        {
                            System.out.println("You are not a Human Being");
                        }

                        break;
                    }
                }
            }

            System.out.println("\n\n\tDo You Want to Continue To Account Secction Then press 1 OtherWise Press Any Number Key for Exit ");
            System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            t = sc.nextInt();
        }
        while(t == 1);
    }

    void mainWindow()
    {
        int option,con ;

        System.out.print("\t	  _________________________________________________________");
        System.out.print("\n\t\t |                                                         |");
        System.out.print("\n\t\t |                   CUSTOMER DETAILS                      |");
        System.out.print("\n\t\t |_________________________________________________________|");
        System.out.print("\n\t\t |                                                         |");
        System.out.print("\n\t\t |              Account Number  "+acnt_no+ "       	   \t   |");
        System.out.print("\n\t\t |              Account Holder Name: "+fst_nm+" "+lst_nm+"  |");
        System.out.print("\n\t\t |              Account Type: "+acnt_type+"                      |");
        System.out.print("\n\t\t |		Account Holder Address: "+prmnt_add+"           |");
        System.out.print("\n\t\t |		Account Holder Contact No:"+cnt_no+"       |");
        System.out.print("\n\t\t |_________________________________________________________|\n\n\n");

        {
            do
            {
                System.out.print("\n\n\t\t	~~~~~~~WELCOME TO ACCOUNT OPERATION FORM~~~~~~~\n");
                System.out.print("\n____________________________________________________________________________________________\n\n");
                System.out.println("Select an Option For Account Operation\n\n");
                System.out.println("1........Check Balance");
                System.out.println("2........Deposite");
                System.out.println("3........Withdraw");
                System.out.print("4........Exit ");
                
                Scanner sc = new Scanner(System.in);
                option =Temp3();
                switch(option)
                {
                    case 1:
                        Check_Balance();
                        break;

                    case 2:
                        Deposite();
                        break;
                    case 3:
                        Withdraw();
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("Invalid Option");
                }
                System.out.println("\n\n   Do You Want to Continue In Account Operation Then Press 1");
                System.out.println("   Otherwise Press  Any Number Key To Exit ");
                con = sc.nextInt();
            }
            while(con == 1);
     }
  }

    void Check_Balance()
    {
        System.out.println("\nCurrent Balance is :"+bal);
    }
    void Deposite()
    {
        int  amt;
	Scanner sc = new Scanner(System.in);
        System.out.print("\n\nTo Deposite, ");
        amt = Temp2();
       if(acnt_type.equals("Current"))
        {
            if(k==1)
            {
                System.out.println("\nA New Current Account Holder, Deposite Minimum Amount = 500\n");
                if(amt>=500)
                {

                    bal += amt;
                    System.out.println("\nYour Current Balance is :"+bal);
                    k--;
                }
                else
                {
                    System.out.println("Sorry! Given Amount below 500Rs. Try Again!");
                }
            }
            else
            {
                if(amt>=100)
                {
                    bal += amt;
                    System.out.println("\nYour Current Balance is :"+bal);
                }
                else
                    System.out.println("Sorry! Entered Amount " +amt+ " not Accepted..Minimum Amount Deposite 100 Rs.");
            }
        }
        else if(acnt_type.equalsIgnoreCase("Saving "))
    	{

            if(k ==1)
            {

                System.out.println("\nA New Saving Account Holder, Deposite Minimum Amount = 1000\n");
                if(amt>=1000)
                {
                    bal += amt;
                    System.out.println("\nYour Current Balance is :"+bal);
                    k--;
                }
                else
                {
                    System.out.println("\nSorry! Given Amount below 1000Rs. Try Again1!");
                }
            }
            else
            {
                if(amt>=100)
                {
                    bal += amt;
                    System.out.println("\nYour Current Balance is :"+bal);
                }
                else
                    System.out.println("Sorry! Entered Amount " +amt+ " not Accepted..Minimum Amount Deposite 100 Rs.");
            }
        }
        else
            System.out.println("\nAccount Type does't Match....Please Enter Valid Option");
    }

    void Withdraw()
    {
        int amt;
	
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\nTo Withdraw, ");
        amt = Temp2();
      if(acnt_type.equals("Current"))
        {
            if(amt>=100)
            {
                if(amt<bal)
                {
                    bal -= amt;

                    if(bal>=0)
                    {
                        System.out.println("\nYour Current Balance is :"+bal);
                        if(bal<500)
                            System.out.println("\nYour Current Balance is below 500Rs.....please Maintain Your Balance at least 500Rs.");
                        else
                            System.out.println("\n\t---(*_*)----Thanks For Using Universal Bank Services---(*_*)----");
                    }
                    else
                    {
                        System.out.println("\nSorry! You Have Not Enough Amount To WithDraw..Please Deposite Your Balance");
                    }
                }
                else
                    System.out.println("Sorry! Entered Amount "+amt+" is More than Or Equal to Balance. \n\n\t Try Again!");
            }
            else
            {
                System.out.println("Sorry! Entered Amount " +amt+ " not Accepted..Minimum Amount Withdraw 100 Rs.");
            }
        } 
        else if(acnt_type.equalsIgnoreCase("Saving "))
        {
            if(amt>=100)
            {
                if(amt<bal)
                {
                    bal -= amt;
                    if(bal>=0)
                    {
                        System.out.println("\n\tYour Current Balance is :"+bal);
                        if(bal<1000)
                            System.out.println("Your Current Balance is below 1000Rs.....please Maintain Your Balance at least 1000Rs.");
                        else
                            System.out.println("\n\t---(*_*)----Thanks For Using Universal Bank Survices---(*_*)----");
                    }
                    else
                    {
                        System.out.println("\nSorry! You Have Not Enough Amount To WithDraw..Please Deposite Your Balance");
                    }
                }
                else
                    System.out.println("Sorry! Entered Amount "+amt+" is More Or Equal to  Balance. \n\n\t Try Again");
            }
            else
            {
                System.out.println("Sorry! Entered Amount " +amt+ " not Accepted..Minimum Amount Withdraw 100 Rs.");
            }
        }
        else
            System.out.println("No Such Types of Account Exsist!");
    }

   

    String Temp()
    {
        int num = 0;
        String input ="";
        String exit = "exit";
        boolean isStringNumber = true;
        Scanner inp = new Scanner(System.in);
        while(true)
        {
            System.out.print("\n\tEnter Your Contact Number: ");
            input = inp.nextLine();
            isStringNumber = input.matches("[0-9]+");
            if(isStringNumber == false)
            {
                System.out.println("\n\t  You entered a non number -> " + input);
                System.out.println("\n\t  Remove all non numbers from your input and Try again !\n");
                continue;
            }
            else
            {
                break;
            }

        }
        return input;

    }
	
	String Temp1()
    	{
      	  	int num = 0;
       	 	String input ="";
        	String exit = "exit";
        	boolean isStringNumber = true;
        	Scanner inp = new Scanner(System.in);
        	while(true)
        	{
        	    System.out.println("\n\tSelect Account Type");
                    System.out.print("\t___________________________________");
                    System.out.print("\n\tEnter 1 for Current Account and 2 for Saving Account: ");
          	    input = inp.next();
          	    isStringNumber = input.matches("[0-9]+");
          	  if(isStringNumber == false)
           	 {
          	      System.out.println("\n\t  You entered a non number -> " + input);
            	    System.out.println("\n\t  Remove all non numbers from your input and Try again !\n");
            	    continue;
           	 }
            	else
            	{
            	    break;
            	}

        	}
       	 return input;

    	}

	 int Temp2()
    	{
      	  	int num = 0;
       	 	String input ="";
        	String exit = "exit";
        	boolean isStringNumber = true;
        	Scanner inp = new Scanner(System.in);
        	while(true)
        	{
        	    System.out.print("Please Enter Your Ammount: ");
          	    input = inp.nextLine();
          	    isStringNumber = input.matches("[0-9]+");
          	  if(isStringNumber == false)
           	 {
          	      System.out.println("\n\t  You entered a non number -> " + input);
            	    System.out.println("\n\t  Remove all non numbers from your input and Try again !\n");
            	    continue;
           	 }
            	else
            	{
            	    break;
            	}

        	}
       	 return Integer.parseInt(input);

    	} 
	
	 int Temp3()
    	{
      	  	int num = 0;
       	 	String input ="";
        	String exit = "exit";
        	boolean isStringNumber = true;
        	Scanner inp = new Scanner(System.in);
        	while(true)
        	{
        	    System.out.print("\n\n\n\nEnter Option: ");
          	    input = inp.nextLine();
          	    isStringNumber = input.matches("[0-9]+");
          	  if(isStringNumber == false)
           	 {
          	      System.out.println("\n\t  You entered a non number -> " + input);
            	    System.out.println("\n\t  Remove all non numbers from your input and Try again !\n");
            	    continue;
           	 }
            	else
            	{
            	    break;
            	}

        	}
       	 return Integer.parseInt(input);

    	} 


}

public class Bank
{
    public static void main(String arg[])
    {
        new Customer();
    }
}
