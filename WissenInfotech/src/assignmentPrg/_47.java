package assignmentPrg;

import java.io.*;
import java.math.*;

public class _47 {
	
		  public static void main(String args[])throws
	      IOException
	{
	if(checkAbundant(12))
	System.out.println("YES");
	else
	System.out.println("NO");
	
	}

	    static int getSum(int n)
	    {
	        int sum = 0;
	   

	        for (int i=1; i<=(Math.sqrt(n)); i++)
	        {
	            if (n%i==0)
	            {

	                if (n/i == i)
	                   sum = sum + i;
	   
	                else
	                {
	                   sum = sum + i;
	                   sum = sum + (n / i);
	                }
	            }
	        }
	   

	        sum = sum - n;
	        return sum;
	    }

	    static boolean checkAbundant(int n)
	    {

	      return (getSum(n) > n);
	    }
	   

	  
	}


