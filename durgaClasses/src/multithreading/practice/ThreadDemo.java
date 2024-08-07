package multithreading.practice;

class Mythread extends Thread{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("Child Thread");
		}
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythread t=new Mythread();
		t.start();
		for(int i=0;i<=10;i++)
		{
			System.out.println("Main thread");
		}

	}

}
