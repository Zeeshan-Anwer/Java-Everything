package com.zeeshan.abstractclass;
class abstraccls
{
	public static void main(String args[])
	{
	//	first f1=new first();
	//	f1.show();
		second s1=new second();
		third t1=new third();
		s1.get(10,15);
		s1.show();
		t1.getdata(20,25);
		t1.show();
	}
}

abstract class first
{
	abstract void show();
} 

class second extends first
{
	private int a;
	private int b;
	void get(int p,int q)
	{
		a=p;
		b=q;
	}
	void show()
	{
		System.out.println(a+ " "+b);
	}
}

class third extends first
{
	private int c;
	private int d;
	void getdata(int p,int q)
	{
		c=p;
		d=q;
	}

		void show()
		{
			System.out.println(c+" "+d);
		}
}


