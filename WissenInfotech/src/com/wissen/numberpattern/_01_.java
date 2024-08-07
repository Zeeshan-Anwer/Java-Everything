package com.wissen.numberpattern;

import java.util.Scanner;

public class _01_ {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter print times");
		int n=sc.nextInt();
		pattern_26(n);

	}

	//1
	public static void pattern_1(int n) {
		for(int i=n; i>0; i--) {
			for(int j=1;j<=i;j++)
				System.out.print(j);
			System.out.println();
		}
	}
	
	//2
		public static void pattern_2(int n) {
			for(int i=1; i<=n; i++) {
				for(int j=i;j<=n;j++)
					System.out.print(j);
				System.out.println();
			}
		}
		
		//3
		public static void pattern_3(int n) {
			for(int i=n; i>0; i--) {
				for(int j=i;j>0;j--)
					System.out.print(j);
				System.out.println();
			}
		}
		
		//4
		public static void pattern_4(int n) {
			for(int i=1; i<n; i++) {
				for(int j=5;j>=i;j--)
					System.out.print(j);
				System.out.println();
			}
		}
		
		//5 
				public static void pattern_5(int n) {
					for(int i=1; i<=n; i++) {
						for(int j=1;j<=i;j++)
							System.out.print(j);
						System.out.println();
					}
				}
					
					//6
					public static void pattern_6(int n) {
						for(int i=n; i>0; i--) {
							for(int j=i;j<=n;j++)
								System.out.print(j);
							System.out.println();
						}
					}				
					

//7
		public static void pattern_7(int n) {
			for(int i=1; i<=n; i++) {
				for(int j=i;j>0;j--)
					System.out.print(j);
				System.out.println();
			}
		}
		
		//8
				public static void pattern_8(int n) {
					for(int i=n; i>0; i--) {
						for(int j=n;j>=i;j--)
							System.out.print(j);
						System.out.println();
					}
				}
				
				//9
				public static void pattern_9(int n) {
					for(int i=1; i<=n; i++) {
						for(int j=1;j<=i;j++)
							System.out.print(i);
						System.out.println();
					}
				}
				
				//10
				public static void pattern_10(int n) {
					for(int i=n; i>0; i--) {
						for(int j=i;j<=n;j++)
							System.out.print(i);
						System.out.println();
					}
				}
				
				//11
				public static void pattern_11(int n) {
					for(int i=n; i>0; i--) {
						for(int j=1;j<=i;j++)
							System.out.print(i);
						System.out.println();
					}
				}
				
				//12
				public static void pattern_12(int n) {
					for(int i=1; i<=n; i++) {
						for(int j=i;j<=n;j++)
							System.out.print(i);
						System.out.println();
					}
				}
				
				//13
				public static void pattern_13(int n) {
					for(int row=5; row>0; row--)
					{
						if(row%2!=0)
						for(int col=1;col<=row;col++) {
							System.out.print(col);
						}
						else
							for(int col=row;col>0;col--) {
								System.out.print(col);
							}
						System.out.println();
					}
				}
				
				//15 error
				public static void pattern_15(int n) {
					for(int row=1; row>0; row--)
					{
						int num;
						if(row%2!=0) {
							num=0;
						for(int col=1;col<=row;col++) {
							System.out.print(num);
							num=(num==0)?1:0;
						}//forcolum
									}//if
						else
						{
							num=1;
							for(int col=1;col<=row;col++) {
								System.out.println(num);
								num=(num==0)?1:0;
							}//forcol
						}//else
							System.out.println();
											}//forrow
				}//pattern
				
				
				//25 error
				public static void pattern_25(int n) {
					for(int row=1;row<=n;row++) {
					
					
					
						for(int col=row;col>=1;col--) {
							System.out.print(col);
						}
						for(int col=2;col<=row;col++) {
							System.out.print(col);
						}
						System.out.println();
					}
					
				}
				//26
				public static void pattern_26(int n) {
					for(int row=1;row<=n;row++) {
					
					
					
						for(int col=1;col>=row;col--) {
							System.out.print(col);
						}
						for(int space=1;space<(n-(row*2));space++) {
							System.out.print(space);
						}
						System.out.println();
					}
					
				}
				


}