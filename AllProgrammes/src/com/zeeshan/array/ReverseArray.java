package com.zeeshan.array;

//Write a prg to reverse an array

import java.util.Scanner;

class ReverseArray{

	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	
	int sizeOfArr,j=0;
	System.out.println("Enter Size Of Array: ");
	sizeOfArr=sc.nextInt();
	int orgarr[]=new int[sizeOfArr];
	int revarr[]=new int[sizeOfArr];
	for(int i=0;i<=sizeOfArr;i++){
		orgarr[i]=sc.nextInt();
	}
	System.out.print("end");
	
	for(int i=sizeOfArr;i>=0;i--) {

if(i>-1) {
			revarr[j]=orgarr[i];
		}
	}
		for(int i=0;i<=sizeOfArr;i++) {
			System.out.print(revarr[i]);
		}
	}

	}
	

	

		
