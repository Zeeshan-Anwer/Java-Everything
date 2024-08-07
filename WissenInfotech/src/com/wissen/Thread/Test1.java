package com.wissen.Thread;

public class Test1 {

	public static void main(String[] args) {
		
		System.out.println("From Thread: "+Thread.currentThread().getName() );
		
		BlockRunnable r1=new BlockRunnable();
		Thread t1= new Thread(r1);
		
		t1.setName("R1");
		t1.start();
	}

}
