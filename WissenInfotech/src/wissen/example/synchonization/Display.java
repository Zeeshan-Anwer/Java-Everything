package wissen.example.synchonization;

public class Display {
	
	public synchronized void wish(String name) {
	
		for(int i=0;i<10;i++) {
			System.out.println("Good Morning");
			
			try
			{
				Thread.sleep(3000);
			}
			catch(InterruptedException e) { }
			
			System.out.println(name);
		}
	}



}
