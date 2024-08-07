package misleniousprg;

import java.io.*;
class IT
	{
		public  static void main(String args[]) throws IOException
			{
		int bp;
		DataInputStream z;
		z= new DataInputStream(System.in);
		System.out.print("\nEnter Your Basic Pay= ");
		bp=Integer.parseInt(z.readLine());
		int da=0,ta=0,hra=0;
		
		
		
		if(bp>=7500)
		{
			da=(bp*49)/100;
			ta=(bp*18)/100;
			hra=(bp*16)/100;
		}
			else if(bp>=5000)
			{
			if(bp>=5000)
			da=(bp*47)/100;
			ta=(bp*16)/100;
			hra=(bp*15)/100;
			}
		else 
		{
			da=(bp*43)/100;
			ta=(bp*15)/100;
			hra=750;
		}
				
		int np=0,yi=0,gp=0;
		double pf=0,esi=0;
			gp=bp+da+ta+hra;
			pf=(2.5*gp)/100;
			esi=(0.5*gp)/100;  
			np=gp-(int)(pf+esi);
			yi=np*12;
				System.out.println("         ");
				System.out.println("***************************************************");
				System.out.println("         ");
				
				System.out.println("Basic Pay      =\t"+bp);
				System.out.println("DA             =\t"+da);
				System.out.println("TA             =\t"+ta);
				System.out.println("HRA            =\t"+hra);
				System.out.println("Gross Pay      =\t"+gp);
				System.out.println("PF             =\t"+pf);
				System.out.println("ESI            =\t"+esi);
				System.out.println("Net Price      =\t"+np);
				System.out.println("Yearly Income  =\t"+yi);
	
		int oper=0;
		int per=0,per1=0,per2=0;
		int temp=0,temp1=0,temp2=0;
		
		if (yi>=450000)
		{
			temp=(yi-450000);
			per=(temp*30)/100;
			temp1=(yi-temp);
			temp2=(temp1-350000);
			per1=(temp2*20)/100;
			per2=(temp2*10)/100;
			oper=per+per1+per2;
		}
		else if(yi>=350000 && yi<=450000)
		{
			temp=(yi-350000);
			per=(temp*20)/100;
			temp1=(yi-temp);
			temp2=(temp1-250000);
			per1=(temp2*10)/100;
			oper=per+per1;
		}
		else if (yi>=250000 && yi<=350000)
		{
			temp2=(yi-250000);
			per1=(temp2*10)/100;
			oper=per1;
		}
		else
			
			oper=0;

				System.out.println("Income Tax     =\t"+oper);
				System.out.println("         ");
				System.out.println("***************************************************");
				System.out.println("         ");
				
	
	}
}

			
		