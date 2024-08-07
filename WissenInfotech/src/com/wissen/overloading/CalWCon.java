package com.wissen.overloading;

public class CalWCon {
	
	int x;
	int y;
	String a,b;
	
	
	CalWCon(){
		
		System.out.println("From CalWCon default constructor");
		
	}
	
	CalWCon(int x,int y){
		 
		this.x=x;
		this.y=y;
}
	
	CalWCon(double x,int y){
		 
		this.x= (int)x;
		this.y=y;
	}
	
	CalWCon(double x,double y){
		 
		this.x=(int)x;
		this.y=(int)y;
	}
	
	
	public int add() {
		return x+y;
	}
	
}
