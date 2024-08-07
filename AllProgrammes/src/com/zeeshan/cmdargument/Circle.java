package com.zeeshan.cmdargument;

class Circle
{
	public static void main(String args[])
	{
		int rad;
		rad=Integer.parseInt(args[0]);
		float area,cir;
		cir=3.14f*rad*rad;
		area=rad*rad*3.14f;
		System.out.println("Area="+area);
		System.out.println("Circumference="+cir);
		
	}
}
