package com.zeeshan.array;
import java.util.Scanner;

class ArrayChallange{
public static void main(String args[]){
	
	int size=-1;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Size Of Array: ");
	int arr[]=new int[size];
		
		for(int i=0;i<size;i++){
		System.out.println("Enter " +(i+1)+ "Elements");
		arr[i]=sc.nextInt();
				}//for
		
		methods m1=new methods();
		m1.duplicateElements(arr,size);
}//main
}//class

class methods{
	void duplicateElements(int arr[],int size){
			for(int i=0;i<size;i++){
				for(int j=i+1;j<size;j++){
					if(i==j)
						System.out.print(i+" ");
}//for j
}//for i
}//duplicatElements
		
}//class