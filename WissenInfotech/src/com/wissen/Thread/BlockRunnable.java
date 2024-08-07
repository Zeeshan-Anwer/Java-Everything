package com.wissen.Thread;

public class BlockRunnable extends BussineessClass  implements Runnable {
	
	int block;

	@Override
	public void run() {
		
		System.out.println("Thread"+Thread.currentThread().getName()+"Carries block"+block);
		
		print();
		
	}

	

}
