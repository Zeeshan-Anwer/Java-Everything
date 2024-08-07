package multithreading.practice;

public class myThread extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread.currentThread().setPriority(6);
		System.out.println(Thread.currentThread().getPriority());
		System.out.println("main method\n"+Thread.currentThread().getName());
		myThread t=new myThread();
		t.setPriority(9);
		t.getPriority();
		System.out.println(t.getName());
	}

}
