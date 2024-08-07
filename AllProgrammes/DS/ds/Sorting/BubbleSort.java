package ds.Sorting;

import java.util.Scanner;
//ctrl +shift+ o

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[4];
		System.out.println("Enter element");
		for(int i=0;i<4;i++) {
		arr[i]=sc.nextInt();
		
		}
		
		
		
		for(int i=0;i<4;i++) {
			System.out.print(arr[i]+" "); //ctrl+space (sout)
			
			}
		
		for(int i=0;i<4;i++) {
			for(int j=i+1;j<4;j++) {
				if(arr[i]<arr[j])   //ctrl+shift+b breakpoint
				{
					arr[i]=arr[i]^arr[j];
					arr[j]=arr[i]^arr[j];
					arr[i]=arr[i]^arr[j];
				}
			}
		}
		System.out.println();
		for(int i=0;i<4;i++) {
			System.out.print(arr[i]+" "); //ctrl+space (sout)
			
			}
		sc.close();
		
		}
	}


