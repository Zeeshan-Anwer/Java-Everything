package com.wissen.Test;

public class Test1 {
	
	public static void main(String[] args) {
		
		int i,j,rows;
		int count=1;
		
		rows=4;
		for(i=1;i<=rows;i++) {
			for(j=1;j<=i;j++) {
				if((i+j)%2==1) {
					System.out.print("0");
				}
				else {
					System.out.print("1");
				}
			}
			System.out.println();
		}
	}

}
