package flowControl.loop.functions;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter numner to check: ");
	int num=sc.nextInt();
	
	System.out.println(checkArmStrong(num));

	}
	public static boolean checkArmStrong(int num) {
		int originalNum=num;
		int sum=0;
		
		while(num>0){
			
		
		int rem=num%10;
		num=num/10; 
		sum= sum+rem*rem*rem;
		}
		return sum==originalNum;
	}

}
