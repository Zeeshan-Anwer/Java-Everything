package com.zeeshan.cmdargument;


class Calculator
{
	public static void main (String args[])
	{
		
		
		
		
		int a,b;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args [1]);
		int c,d,e;
		float f;
		
		c=a+b;
		d=a-b;
		e=a*b;
		f=(float)(a/b) ;
		
		System.out.println("Addition: "+c);
		System.out.println("Subtraction: "+d);
		System.out.println("Multiplication: "+e);
		System.out.println("Division: "+f);
	
		
		
	}
		}
		