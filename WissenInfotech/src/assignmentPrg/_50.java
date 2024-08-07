package assignmentPrg;

import java.util.Arrays;

public class _50 {

	    static void circularPrime(int n)
	    {

	        int nNew = (n - 2) / 2;
	 
	 
	        boolean marked[] = new boolean[nNew + 1];
	 
	   
	        Arrays.fill(marked, false);
	 
	        SieveOfSundaram(marked, nNew);
	 
	     
	        System.out.print("2 ");
	 
	    
	    
	        for (int i = 1; i <= nNew; i++) {
	        
	            if (marked[i] == true)
	                continue;
	 
	            int num = 2 * i + 1;
	            num = Rotate(num); 
	 
	      
	            while (num != 2 * i + 1) {
	                if (num % 2 == 0) 
	                    break;
	 
	               
	                if (marked[(num - 1) / 2] == false)
	                    num = Rotate(num);
	                else
	                    break;
	            }
	 
	         
	            if (num == (2 * i + 1))
	                System.out.print(num + " ");
	        }
	    }
	 
	    
	    static void SieveOfSundaram(boolean marked[], int nNew)
	    {
	        
	        for (int i = 1; i <= nNew; i++)
	            for (int j = i; (i + j + 2 * i * j) <= nNew; j++)
	                marked[i + j + 2 * i * j] = true;
	    }
	 
	 
	    static int countDigits(int n)
	    {
	        int digit = 0;
	        while ((n /= 10) > 0)
	            digit++;
	        return digit;
	    }
	 
	 
	    static int Rotate(int n)
	    {
	        int rem = n % 10; 
	        rem *= Math.pow(10, countDigits(n));
	    
	        n /= 10; 
	        n += rem; 
	        return n;
	    }
	 

	    public static void main(String[] args)
	    {
	        int n = 100;
	        circularPrime(n);
	    }
	}


