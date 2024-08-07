package com.zeeshan.array;
import java.util.Scanner;

class Arrayofobject
{
	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		int n,i;
		System.out.println("Enter Array Size=");
		n=ss.nextInt();
		student s[]=new student[n];
		for(i=0;i<n;i++)
		{
			s[i]=new student();
			s[i].get();
		}
			System.out.println("Student Database=");
			for(i=0;i<n;i++)
				s[i].show();
		
	}
}



class student
{
	private String name=new String();
	private int fee;
	private int roll;
	void get()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Name=");
		name=s.nextLine();
		System.out.println("Enter Roll Number=");
		roll=s.nextInt();
		System.out.println("Enter fee=");
		fee=s.nextInt();
	}
	void show()
	{
		System.out.println(roll+" "+name+" "+fee);
	}
}

