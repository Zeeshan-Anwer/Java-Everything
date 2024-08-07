package assignmentPrg;

import java.util.Arrays;
import java.util.Scanner;

public class _35 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int a=sc.nextInt();
		System.out.println("Enter Number:");
		int b=sc.nextInt();
		System.out.println("Enter Number:");
		int c=sc.nextInt();
		
		int arr[]=new int[3];
		arr[0]=a;
		arr[1]=b;
		arr[2]=c;
		Arrays.sort(arr);
		int diff1=arr[2]-arr[1];
		int diff2=arr[1]-arr[0];
		if(diff2==diff1)
			System.out.println("True");
		else
			System.out.println("False");
}
}