package multithreading.practice;

import com.mypractice.Mythread;

class Mythread implements Runnable{
	public void run()
	{
		System.out.println("Hello");
	}
}

class practice extends Mythread{
	public static void main(String args[])
	{
		
		Mythread r=new Mythread();
		Thread t1=new Thread(r);
		t1.start();
		t1.setName("Hell");
		System.out.println("Bye");
		System.out.println(t1.getName());
		System.out.println(Thread.currentThread().getName());
		t1.setPriority(5);
		t1.getPriority();
		
		
		
	}
}