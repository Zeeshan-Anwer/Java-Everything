package ds.Array;

import java.util.Scanner;

public class ArrayAssignment1{
	
		public static void main(String args[]){
			
			int size=0,choice=0;
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter Size Of Array: ");
			size=sc.nextInt();
			int arr[]=new int[size];
				
				for(int i=0;i<size;i++){
				System.out.print("Enter Element "+(i+1)+": ");
				arr[i]=sc.nextInt();
						}//for
				Methods m1=new Methods();
				do {
					System.out.println("1: getDuplicateElements ");
					System.out.println("2: getThirdLargElement");
					System.out.println("3: getMaxDiffrence");
					System.out.println("4: getMaxMin");
					System.out.println("5: get2ndMaxMin");
					System.out.println("6: getRemoveDuplicateElement");
					System.out.println("7: getElementPair");
					System.out.println("To Terminate Prg Press 0");
					System.out.print("Enter Your Choice: ");
					choice=sc.nextInt();
					switch (choice) {
					case 1:
						m1.getDuplicateElements(arr,size);
					break;
					case 2:
						m1.getThirdLargElement(arr, size);
						break;
					case 3:
						m1.getMaxDiffrence(arr,size);
						break;
					case 4:
						m1.getMaxMin(arr,size);
						break;
					case 5:
						m1.get2ndMaxMin(arr, size);
						break;
					case 6:
						m1.getRemoveDuplicateElement(arr,size);
						break;
					case 7:
						int sum=0;
						System.out.print("Enter Sum:");
						sum=sc.nextInt();
						m1.getElementPair(arr, size, sum);
						break;
					default:
						{
							System.out.println("To Terminate Prg Enter 0 \nPlease Enter Again: " );
}
					}
		}
				while(choice!=0);
				sc.close();
		}//main
		}//class

		class Methods{
			
			void getArrayElements(int arr[],int size) {
				System.out.print("Array elements are: ");
				for(int i=0;i<size;i++) {
						System.out.print(arr[i]+" ");
				}
				System.out.println();
				}// ArrayElements method
				
			
		void getDuplicateElements(int arr[],int size){
			getArrayElements(arr,size);
			
		System.out.print("Duplicate Elements :  ");
					for(int i=0;i<size;i++){
						for(int j=i+1;j<size;j++){
							if(arr[i]==arr[j])
							System.out.print(arr[i]+" ");
		}//for j
		}//for i
					System.out.println();
		}//duplicatElements
		
		
		void getThirdLargElement(int arr[],int size) {
			getArrayElements(arr,size);
			for(int i=0;i<size;i++) {
				for(int j=i+1;j<size;j++) {
					if(arr[i]>arr[j])   
					{
						arr[i]=arr[i]^arr[j];
						arr[j]=arr[i]^arr[j];
						arr[i]=arr[i]^arr[j];
					}//if
				}//for j
			}//for i
			System.out.print("Third Largest Element: ");
				System.out.println(arr[size-3]);
		}//getThirdLargeElement
		
		void getMaxDiffrence(int arr[],int size) {
			getArrayElements(arr,size);
			for(int i=0;i<size;i++) {
				for(int j=i+1;j<size;j++) {
					if(arr[i]>arr[j])   
					{
						arr[i]=arr[i]^arr[j];
						arr[j]=arr[i]^arr[j];
						arr[i]=arr[i]^arr[j];
					}//if
				}//for j
			}//for i
			int arrLength=arr.length;
			System.out.println("Maximun Diffrence: "+(arr[arrLength-1]-arr[0]));
		}//getMaxDiffrence
		
		void getMaxMin(int arr[],int size) {
			getArrayElements(arr,size);
			for(int i=0;i<size;i++) {
				for(int j=i+1;j<size;j++) {
					if(arr[i]>arr[j])  
					{
						arr[i]=arr[i]^arr[j];
						arr[j]=arr[i]^arr[j];
						arr[i]=arr[i]^arr[j];
					}//if
				}//for j
			}//for i
			
			System.out.println("Max: "+arr[size-1]);
			System.out.println("Min: "+arr[0]);
		}//getMaxMin
		
		void get2ndMaxMin(int arr[],int size) {
			getArrayElements(arr,size);
			for(int i=0;i<size;i++) {
				for(int j=i+1;j<size;j++) {
					if(arr[i]>arr[j])   
					{
						arr[i]=arr[i]^arr[j];
						arr[j]=arr[i]^arr[j];
						arr[i]=arr[i]^arr[j];
					}//if
				}//for j
			}//for i
			
			System.out.println("2nd Max: "+arr[size-2]);
			System.out.println("2nd Min: "+arr[1]);
		}//get2ndmaxmin
		
		void getRemoveDuplicateElement(int arr[],int size) {
			for(int i=0;i<size;i++) {
				for(int j=i+1;j<size;j++) {
					if(arr[i]==arr[j])
						break;
					if(arr[i]!=arr[j]&&j==size-1)
						System.out.print(arr[i]+" ");
				}//j
				if(i==size-1)
					System.out.print(arr[i]);
			}//i
		}//getRemove
		
		void getElementPair(int arr[],int size,int sum){
			for(int i=0;i<size;i++){
				for(int j=i+1;j<size;j++) {
					if(arr[i]+arr[j]==sum)
						System.out.println(arr[i]+" "+ arr[j]);
				}//for j
			}//fori 
		}//getElementPair
		
		}//class


