package com.wissen.overloading;

public class Calc {
	
	
	public int add(int x,int y) {
		
		return x+y;
		
	}
	
	public double add(double x,int y) {
		
		return x+y;
		
	}
	
	public double add(int x,double y) {
		
		return x+y;
		
	}
	
	public double add(double x,double y) {
		
		return x+y;
		
	}
	
	public String add(String x,String y) {
		
		return x+y;
		
	}

}
