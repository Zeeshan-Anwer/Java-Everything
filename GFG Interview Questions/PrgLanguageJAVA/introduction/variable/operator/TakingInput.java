package introduction.variable.operator;

import java.util.Scanner;

public class TakingInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	float b=sc.nextFloat();
	byte c=sc.nextByte();
	short d=sc.nextShort();
	long e=sc.nextLong();
	double f=sc.nextDouble();
	char g=sc.next().charAt(0);
	boolean h=sc.nextBoolean();
	String i=sc.next();
	sc.hasNextLine();
	sc.close();
	
	System.out.println(a+b);
	
				
	}

}
