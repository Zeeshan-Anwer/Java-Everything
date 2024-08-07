package com.wissen.Thread;

public class BlockCarrier extends Thread {
	
	int block;
	
	@Override
	public void run() {
		
		System.out.println("Thread "+this.currentThread().getName() +" Carries Block "+block);
	}
	
	public void print() {
		
		System.out.println("Thread "+this.currentThread().getName() +" Carries Block "+block);
	}


}
