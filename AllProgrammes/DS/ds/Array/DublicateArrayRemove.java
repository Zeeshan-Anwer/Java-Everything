/*
1)Write a Java Program to find duplicate elements in given Array?

Input:  1, 2, 5, 5, 6, 6, 7, 2

Output:  2, 5, 6

*/
package ds.Array;

import java.util.Scanner;

class RemoveArrayDublicate{


public static int AvoidDuplicates(int arr[], int size){
	int j = 0;
	for(int i=0;i<size-1;i++) {
			if(arr[i]!=arr[i+1]) {
			arr[j++] = arr[i];
		}
	
	}
	arr[j++]=arr[size-1];
	return j;
	}//method1
public int SortArray(int arr[],int size) {
	int temp;
		for(int i=0;i<size-1;i++) {
			for(int j = i;j<size-1;j++) {
				if(arr[i]>arr[j+1]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}//if
			}//for
		}//for2
		return arr[size-1];
	}//method2
}//class

public class DublicateArrayRemove {

	public static void main(String[] args) {
		RemoveArrayDublicate ad = new RemoveArrayDublicate();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of Array:");
		int input = in.nextInt();
		int[] arr = new int[input];
		int sizearr = arr.length;
		for(int i=0;i<sizearr;i++) {
			System.out.println("Enter "+(i+1)+" index:");
			arr[i]=in.nextInt();
		}//for
		ad.SortArray(arr, sizearr);
		int length=ad.AvoidDuplicates(arr, sizearr);
		for(int i=0;i<length-1;i++) {
			System.out.print(arr[i]+" ");
		}
	}//main
}//class
	
