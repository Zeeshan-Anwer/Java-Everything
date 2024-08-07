package wissen.example.synchonization;

public class SynchronizedDemo {

	public static void main(String[] args) {
		
		Display d1=new Display();
		Display d2=new Display();
		
		Mythread t1=new Mythread(d1,"Dhoni");
		Mythread t2=new Mythread(d2,"Irfan");
		
		t1.start();
		t2.start();
		


	}

}
