package multithreading.practice;

class Mythread extends Thread{
	public void run()
	{
		for(int i=0;i<=10;i++) {
			Thread.yield();
			System.out.println("Child Thread");
			
		}
	}
}

class YieldMethod extends Mythread{
	public static void main(String args[])
	{
		Mythread t1=new Mythread();
		t1.start();
		for(int i=0;i<=10;i++)
		{
			
			System.out.println("Main Thread");
		}
	}
}