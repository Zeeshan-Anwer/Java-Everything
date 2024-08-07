package com.time.practice;

import java.util.Scanner;

class maxMin{
	public static void main(String args[]){
	int size;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Size Of Array: ");
		size=sc.nextInt();
	int arr[]=new int[size];
		
		for(int i=0;i<size;i++){
		System.out.print("Enter Element "+(i+1)+": ");
		arr[i]=sc.nextInt();
				}//for
	int max=arr[0];
	int min=arr[1];

	for(int i=0;i<size;i++){
		
			if(max<arr[i]);
		max=arr[i];
			if(min>arr[i]);
		min=arr[i];

}//for i
	
	System.out.println("maximum diffrence:  "+(max-min));
	System.out.println("max: "+max);
	System.out.print("min: "+min);
}//main

}//class